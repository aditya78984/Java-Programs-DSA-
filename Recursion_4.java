//Print x power n (stack height = n)

public class Recursion_4 {
    public static int xPowern( int x , int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPownm1=xPowern(x,n-1);
        int xPown = x * xPownm1;
        return xPown;
    }

    public static void main(String args[]){
        int x=2;
        int n = 5;
        int result = xPowern(x,n);
        System.out.println(result);
    }
}

