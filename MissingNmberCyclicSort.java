

public class MissingNmberCyclicSort {

    public static void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static int missingNumber(int[] arr){
        int n = arr.length;
        int i = 0;
        while(i<n)
        {
            if(arr[i] == n || arr[i]==i){
                i++;
            }
            else{
                swap(arr, i, arr[i]);
            }
        }
        for(int j=0 ; j<n ; j++)
        {
            if(arr[j] != j){
                return j;
            }
        }
        return n;
    }
    public static void main(String args[]){
        int arr[]={3,0,2,1};
        int ans = missingNumber(arr);
        System.out.println(ans);;
        
        
    }
}
