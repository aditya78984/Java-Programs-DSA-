public class BinarySearch {
    public static int binarySearch(int [] arr , int num , int start , int end){

        if(end>=start){
            
            int mid = start + (end-start)/2;
            if(arr[mid]==num){
            return mid;
            }
            if(arr[mid] > num){
                return binarySearch(arr,num,start,mid-1);
            }
            if(arr[mid]<num){
                return binarySearch(arr, num, mid+1, end);
            }
            
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={12,34,54,88,160,180};
        int ans = binarySearch(arr, 160,0,5);
        System.out.println(ans);
    }
}
