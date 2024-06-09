import java.util.Arrays;

public class FirstAndLastOccurrence {
    public static int[] searchRange(int arr[] , int target){
        int ans[] = {-1,-1};
        ans[0] = search(arr,target,true);
        ans[1]=search(arr,target,false);
        return ans;
    }
    public static int search(int arr[] , int target ,boolean startIndex){
        int start=0 , end=arr.length-1 , mid ;
        int ans=-1;
        
        while(start<=end){
            mid=(start+end)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
            else{
                //potential ans found
                ans=mid;

                if(startIndex){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={5,7,7,7,7,8,8,10};
         System.out.println(Arrays.toString(searchRange(arr, 7)));
        
    }
    
}
