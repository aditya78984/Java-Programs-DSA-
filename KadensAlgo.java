public class KadensAlgo {
    public static void kadens(int[] numbers){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        boolean negative=true;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>0){
                 negative=false;
                break;
            }
        }
        if (negative==false){
        for(int i=0;i<numbers.length;i++){
            currSum = currSum + numbers[i];
            if(currSum<0){
                currSum=0;
            }
            maxSum=Math.max(currSum,maxSum);
        }
        }
        else{
            for(int i=0;i<numbers.length;i++){
                
                maxSum=Math.max(numbers[i],maxSum);
            }
        }
        
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String[] args) {
        // int[] arr={-2,-3,-4,-10,-2,-11,-5,-31};
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        
        kadens(arr);
    }
}
