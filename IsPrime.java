public class IsPrime {
    public static Boolean isPrime(int num){

        if(num==1){
            System.out.println("1 is neither prime nor composite");
            return false;
        }
        for(int i=2 ; i<=num/2 ; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Boolean ans = isPrime(2);
        System.out.println(ans);
    }
}
