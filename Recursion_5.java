//Print x power n (stack height = logn)

/*Stack formed during recursive function calls will  be of height logn as the problem for
 n power is being divided into n/2 */

public class Recursion_5 {
    public static int xPown(int x , int n){
        if (n==1){
            return x;
        }
        if(x==0){
            return 0;
        }

        //for even power
        if(n%2==0){
            return xPown(x,n/2) * xPown(x,n/2);
        }//for odd power
        else{
            return xPown(x,n/2) * xPown(x,n/2) * x;
        }

    }

    public static void main(String args[]){
        int x=2,n=4,result;
        result=xPown(x,n);
        System.out.println(result);
    }
}
