public class NPrimeNumbers {
    public static void prime(int num){

        //num is the nnumber upto which given function will print prime numbers 

        
        for(int i=2 ; i<=num ; i++){
            int flag=1;
            for(int j=2 ; j<i ; j++){
                if(i%j==0){
                    flag=0;
                    break;
                }
            }
            if(flag!=0){
                System.out.println(i);
            }
        }
    } 

    public static void main(String[] args) {
        prime(30);
    }
}
