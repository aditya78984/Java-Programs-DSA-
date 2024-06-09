public class CeilingOfNumber {
    public static int ceiling(int arr[] , int target){
        int start=0 , end=arr.length-1 , mid;
        if(target>arr[end]){
            return -1;
        }
        while(start<=end){
            mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[start];
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int ans = ceiling(arr, 1);
        System.out.println(ans);
    }
}
