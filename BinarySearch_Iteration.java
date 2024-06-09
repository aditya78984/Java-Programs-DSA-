public class BinarySearch_Iteration {
    
    public static int binarySearch(int arr[],int num,int start,int end){

        while(end>=start){
            int mid=start + (end-start)/2;
            if(arr[mid]>num){
                end=mid-1;
            }
            else if(arr[mid]<num){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,34,54,88,160,180};
        int ans = binarySearch(arr, 12,0,5);
        System.out.println(ans);
    }
}
