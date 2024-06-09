public class SUm_of_odd_nos_func {
    public static void sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=(2*i-1);
        }
        System.out.println("Sum of first n odd numbers : " + sum);
    }

    public static void sumOfOddbtwn(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if ( i%2 != 0 ){
                sum+=i;
            }
        }

        System.out.println("Sum of  odd numbers between 1 to n : " + sum);
    }
    
    public static void main(String args[]){
        int n=50;
        sumOfOddbtwn(n);
    }
}
