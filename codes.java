//import java.util.*;
public class codes {
    // public static void reverse(int[] arr ){
    //     int i=0 , j = arr.length-1;
    //     int mid=(i+j)/2;
    //     while(i<=mid){
    //         int temp = arr[i];
    //         arr[i]=arr[j];
    //         arr[j]=temp;
    //         i++;
    //         j--;
    //     }
    //     for(int num:arr){
    //         System.out.print(num+" ");
    //     }
    // 
        public static void printSubArr(int[] arr){
            int n=arr.length;
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            int sum;
            for(int i=0;i<n;i++){
                int start=i;
                for(int j=i;j<n;j++){
                    int end=j;
                     sum=0;
                    for(int k=start;k<=end;k++){
                        System.out.print(arr[k]+" ");
                        sum+=arr[k];
                    }
                    if(max<sum){
                        max=sum;
                    }
                    if(min>sum){
                        min=sum;
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("min="+min+" max="+max);
        }



    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        // reverse(arr);
        printSubArr(arr);
    }
}
