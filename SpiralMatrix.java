public class SpiralMatrix {
    public static void spiralMatrix(int[][] arr){
        int sRow = 0 ;
        int eRow = arr.length - 1 ; 
        int sCol = 0 ;
        int eCol = arr[0].length - 1;
        while(sRow<=eRow && sCol<=eCol)
        {
            //top
            for(int i = sCol ; i<=eCol ; i++){
                System.out.print(arr[sRow][i] + " ");
            }

            //right
            for (int i = sRow+1; i <= eRow; i++) {
                System.out.print(arr[i][eCol] + " ");
            }

            //bottom
            for(int i = eCol-1 ; i>=sCol ; i--){
                if(sRow==eRow){
                    break;
                }
                System.out.print(arr[eRow][i] + " ");
            }

            //left
            for (int i = eRow-1; i >= sRow+1; i--) {
                if(sCol==eCol){
                    break;
                }
                System.out.print(arr[i][sCol] + " ");
            }

            sRow++;
            eRow--;
            sCol++;
            eCol--;

        }

    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4} , 
                       {5,6,7,8},
                       {9,10,11,12} 
                    };
        spiralMatrix(arr);
    }
}
