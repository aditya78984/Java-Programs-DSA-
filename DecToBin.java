import java.util.*;
public class DecToBin {
    public static void decToBin(int num){
        // int[] arr =new int[10];
        // int n=num  ;
        // int i=-1;
        // while(n>0){
        //     i++;
        //     arr[i]=n%2;
        //     n=n/2;
            
        // }
        // System.out.print("Binary of "+ num + " = ");
        // for(int j=i;j>=0;j--){   
        //     System.out.print(arr[j]+"");
        // }
        int n=num;
        int pow=0;
        int ans=0;
        while(n>0){
            int rem=n%2;
            ans=ans+(int)(Math.pow(10,pow)*rem);    
            n=n/2;
            pow++;

        }
        System.out.print("Binary of "+ num + " = "+ans);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        decToBin(num);
        sc.close();
    }
}
