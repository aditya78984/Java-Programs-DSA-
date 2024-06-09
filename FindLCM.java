public class FindLCM {
    
    // lcm = (num1 * num2) / (hcf(num1, num2))

    public static int lcm(int n1 , int n2){

         return (n1 * n2) / (hcf(n1, n2));

          // Alternate Method 

    /* 
     int a = Math.max(n1 , n2);
        int i;
     for( i = a ; i<=n1*n2 ; i=i+a){
        if(i%n1==0 && i%n2==0){
            break;
        }
     }
     return i;
     */
       
    }

    public static int hcf(int n1 , int n2){
        int factor = 1;
        for(int i=1 ; i<=Math.min(n1 , n2) ; i++){

            if(n1%i == 0 && n2%i ==0){
                factor = i;
            }
            
        }
        return factor;
    }

  

    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 10;

        System.out.println(lcm(n1,n2));
    }

}
