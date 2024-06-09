import java.util.Arrays;

public class SearchInRowColumnSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                    {10,20,30,40} , 
                    {12,24,34,42} , 
                    {18,28,39,49} ,
                    {23,31,41,50} ,
        };
        System.out.println(Arrays.toString(search(arr,23)));
    }
    public static int[] search(int matrix[][] ,  int target){
        int r = 0;
        int c = matrix[0].length - 1 ;

        while( r < matrix.length && c>=0 ){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if (matrix[r][c] > target){
                c--;
            }
            else{
                r++;
            }
        }
        return new int[]{-1, -1};
    }
}
