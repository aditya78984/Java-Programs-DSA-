public class gcd_function {
    public static void gcd(int a ,int b){
        int count=1;
        for(int i=1 ; i<=a && i<=b ; i++){
            if( a%i ==0 && b%i == 0){
                count=i;
            }
        }
        System.out.printf("The gcd of numbers %d And %d is %d",a,b,count);
    }

    public static void main(String args[]){
        int a=14;
        int b=21;
        gcd(a,b);
    }
    
}
