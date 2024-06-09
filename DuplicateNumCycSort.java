public class DuplicateNumCycSort {
    
    public static void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int findDuplicate(int[] arr){
        int i = 0;
        while (i < arr.length) {
            if(arr[i] != i+1){
                if(arr[i]!=arr[arr[i]-1]){
                    swap(arr , i , arr[i]-1);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }
}
