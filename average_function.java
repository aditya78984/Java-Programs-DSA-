import java.util.Scanner;
public class average_function {

    public static float average(int a , int b, int c){
        float avg=(a+b+c)/3.0f;
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.s ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float avg =average(a,b,c);
        System.out.println("The average of three no.s are " + avg);
        sc.close();
    }
}
