//Prefix Array Method
//Time complexity =O(n2)

public class MaxSubarraySum2 {
    public static void maxSubArrSum(int[] numbers){
        int currSum;
        int maxSum=Integer.MIN_VALUE;
        int[] prefix=new int[numbers.length];
        prefix[0]=numbers[0];

        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;

                currSum= start==0 ? prefix[end]:prefix[end] - prefix[start-1];
                
                if(currSum>maxSum){
                    maxSum=currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String[] args) {
        // int[] arr={2,4,6,8,10};
        int[] arr={1,-2,6,-1,3};
        
        maxSubArrSum(arr);
    }
}
