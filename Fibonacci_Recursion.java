// Print Fibonacci Series upto n terms using recursion 


public class Fibonacci_Recursion {

    public static void printFib(int a , int b , int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.println(c);
        a=b;
        b=c;
        
        printFib(a,b,n-1);
    }

    // public static int printFib( int n){
    //     if(n==0){
    //         return 0;
    //     }
    //     else if(n==1){
    //         return 1;
    //     }
    //     else{
    //         return printFib(n-1) + printFib(n-2);
    //     }
        
    // }
    public static void main(String args[]){
        int n=7;
        System.out.println("0");
        System.out.println("1");
        printFib(0,1,n-2);
    } 
    // public static void main(String args[]){
    //     int n=7;
        
    //     System.out.println(printFib(n));
    // }

}
