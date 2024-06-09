import java.util.*;

public class SearchingInSortedMatrix {
    
    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30,40} , 
            {50,60,70,80} , 
            {90,100,110,120} ,
            {130,140,150,160} ,
        };
        System.out.println(Arrays.toString(search(arr,160)));
    }

    public static int[] search(int matrix[][] ,  int target){

        int n = matrix.length;
        int m = matrix[0].length;

        int start = 0;
        int end = n*m - 1;

        while(start<=end){
            int mid = (start + end) / 2;

            if(matrix[mid/m][mid%m] == target){
                return new int[]{mid/m , mid%m};
            }
            if(matrix[mid/m][mid%m] > target){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return new int[]{-1, -1};

    }
}
