import java.util.Scanner;
public class transpose {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter rows and columns : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int [][] arr = new int[rows][cols];
        System.out.println("Enter elements : ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("The transpose of a matrix is : ");
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                System.out.print(arr[j][i] + "  ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
