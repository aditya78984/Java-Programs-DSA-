// public class NumberPalindrome {
//     public static boolean palindrome(int num){
//         int myNum=num;
//         int n=num;
//         int ans=0;
//         int count=-1;
//         while(num>0){
//             count++;
//             num=num/10;
//         }
//         while(n>0){
//             int rem=n%10;
//             ans=ans+(rem*(int)(Math.pow(10,count)));
//             n=n/10;
//             count--;
//         }
//         if(ans==myNum){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         int num=23;
//         System.out.println(palindrome(num));
//     }
// }
import java.util.Scanner;
public class NumberPalindrome {
public static void main(String args[]) {
System.out.println("Please Enter a number : ");
Scanner sc = new Scanner(System.in);
int palindrome = sc.nextInt();
if(isPalindrome(palindrome)) {
System.out.println("Number : " + palindrome + " is a palindrome");
} else {
System.out.println("Number : " + palindrome + " is not a palindrome");

}
sc.close();
}
public static boolean isPalindrome(int number) {
int palindrome = number; // copied number into variable
int reverse = 0;
while (palindrome != 0) {
int remainder = palindrome % 10;
reverse = reverse * 10 + remainder;
palindrome = palindrome / 10;
}

// if original and the reverse of number is equal means
// number is palindrome in Java
if (number == reverse) {
return true;
}
return false;
}
}