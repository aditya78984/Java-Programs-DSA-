public class OptimizedXPowerN{
    public static int power(int x , int n){
        if(n==0){
            return 1 ; 
        }
        if(n%2==0){
            int temp = power(x, n/2) ;
            return temp*temp ;
        }
        else{
            int temp = power(x , n/2);
            return x*temp*temp ;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}