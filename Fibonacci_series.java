public class Fibonacci_series {
    public static void fib(int n){
        int a=0;
        int b=1;
        int count=0;
        System.out.print("Fib series : 0 1 ");
        for(int i=1;i<=n-2;i++){
            count=a+b;
            a=b;
            b=count;
            System.out.print( count + " ");
        }
    }

    public static void main(String args[]){
        int n=10;
        fib(n);
    }
}
