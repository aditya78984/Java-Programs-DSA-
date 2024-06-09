public class FindHCF {
    public static int hcf(int n1 , int n2){
        int factor = 1;
        for(int i=1 ; i<=Math.min(n1 , n2) ; i++){

            if(n1%i == 0 && n2%i ==0){
                factor = i;
            }
            
        }
        return factor;

        //Alternate Method
            /*
         if(n1==0){
            return n2;
        }
        return hcf( n2%n1 , n1); */
        
    }
    public static void main(String[] args) {
        int n1 = 26;
        int n2 = 10;

        System.out.println(hcf(n1,n2));
    }
}
