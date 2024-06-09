// public class App {
//     public static int ls(String[] arr,String item){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==item){
//                 return i;
//             }
//         }
//         return -1;

//     }
//      public static void main(String[] args){ //throws Exception {
//     //     //System.out.println("Hello, World!");
//     //     float sum;
//     //     long a=10L;
//     //     int b=30;
//     //     int c=50;
//     //     sum=(a+b+c)/4f;
//     //     System.out.println(sum);






//     // int n=5;
//     // for(int i=1;i<=n;i++){
//     //     for(int j=1;j<=n-i;j++){
//     //         System.out.print(" ");
//     //     }
//     //     for(int j=1;j<=i;j++){
//     //         System.out.print(" *");
//     //     }
//     //     System.out.println();
//     // }




//     // for(int i=1;i<=n;i++){
//     //     for(int j=1;j<=i;j++){
//     //         System.out.print("*");
//     //     }
//     //     for(int j=1;j<=2*(n-i);j++){
//     //         System.out.print(" ");
//     //     }
//     //     for(int j=1;j<=i;j++){
//     //         System.out.print("*");
//     //     }
//     //     System.out.println();

//     // }
//     // for(int i=n;i>=1;i--){
//     //     for(int j=1;j<=i;j++){
//     //         System.out.print("*");
//     //     }
//     //     for(int j=1;j<=2*(n-i);j++){
//     //         System.out.print(" ");
//     //     }
//     //     for(int j=1;j<=i;j++){
//     //         System.out.print("*");
//     //     }
//     //     System.out.println();

//     // }
    

//     String[] menu={"maggie","samosa","poha","pakoda","jalebi"};
//     System.out.println(ls(menu,"jaleb"));

//     }
// }

import java.util.ArrayList;

public class App{
    public static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        // code here
        ArrayList<Integer> num = new ArrayList<>() ;
        
        int i=1;
        while(i<=n){
            if(arr[i] == i ){
            num.add(i);
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int arr[] = {15,2,34,55,90};
        System.out.println(valueEqualToIndex(arr, 5));
    }
}
