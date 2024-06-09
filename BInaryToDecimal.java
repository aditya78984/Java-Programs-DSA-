import java.util.*;
public class BInaryToDecimal {
    public static void binToDec(long num){
        long   n=num , count=0,sum=0;
        while(n>0){
            
            n=n/10;
            count+=1;
        }
        long temp= num;
        for(long i=0;i<count;i++){
            long rem=num%10;
            num=num/10;
            sum=(long) (sum+Math.pow(2,i)*rem);
        }
        System.out.println("Decimal of "+temp+" = "+sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long num=sc.nextLong();
        binToDec(num);
        sc.close();
    }
}
