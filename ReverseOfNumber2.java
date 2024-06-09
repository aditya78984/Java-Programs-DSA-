import java.util.*;
public class ReverseOfNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int rem , reverse=0;
        while(num>0){
            rem=num%10;
            reverse=(reverse*10)+rem;
            num=num/10;

        }
        System.out.println(reverse);
        sc.close();
    }
}
