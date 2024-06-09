

public class MaxProfit {
    public static int maxProfit(int[] arr){
        int temp=0 , diff=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[j]-arr[i];
                    if(temp>diff){
                        diff=temp;
                        
                    }
                }
                
            }
        }
        if(diff>0)
        return diff;
        else
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int ans=maxProfit(arr);
        System.out.println(ans);
    }
}
