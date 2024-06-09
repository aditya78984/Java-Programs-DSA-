//Check whether an array is strictly increasing/sorted or not.   

// [10,30,40,50] is strictly increasing
// [10,30,30,50] is not strictly increasing as 30 occurred two times


public class Recursion_2 {
    public static int flag=1;
    public static void checkArr(int index , int arr[]){
        
        if(index==0){
            if (flag==1){
                System.out.println("array is sorted");
            }
            else{
                System.out.println("array is not sorted");
            }
            return;
        }
        if(arr[index]<=arr[index-1]){
            flag=-1;
        }
        checkArr(index-1,arr);
    }
    public static void main(String args[]){
        int arr[]={1,3,4,14,14};
        checkArr(arr.length-1,arr);
    }
}
