import java.util.*;
 class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if(year%4==0){
        if(year%100==0){
            if(year%400==0){
                System.out.println("It is a leap year");
            }
            else{
                System.out.println("Not a leap year");
            }
            
        }
        else{
            System.out.println("It is a leap year");
        } 
        
    }
    else{
        System.out.println("Not a leap year");
    }
    sc.close();      //It is used to stop memory leak due to the sc object.
    }
    
}
