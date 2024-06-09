import java.util.Arrays;

public class AntiDiagonal {
    public static int[] antiDiagonalPattern(int[][] matrix)
    {
        int n = matrix.length;
        int[] result = new int[n*n];
        int k = 0;
        int i=0, j=0, row=0, col=0;
        
        while( i<=n-1 && j<=n-1 ){
            result[k] = matrix[i][j] ;
            k++;
            
            if(j==0 && col!=n-1){
                col++;
                row=0;
                j=col;
                i=row;
            }
            else if(col == n-1 && i==n-1){
                row++;
                j=col;
                i=row;
            }
            else{
                j--;
                i++;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                        {4,5,6},
                        {7,8,9}
                        };
        System.out.println(Arrays.toString(antiDiagonalPattern(matrix)));
   }
}
