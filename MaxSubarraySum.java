public class MaxSubarraySum{
    public static void maxSubArrSum(int[] numbers){
        int currSum;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    currSum+=numbers[k];
                }
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        
        maxSubArrSum(arr);
    }
}
