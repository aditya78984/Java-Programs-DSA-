public class RotationBinarySearch {

    public static int findPivot(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if(arr[mid]<arr[start]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int searchInRotatedArray(int arr[] , int target){
        int start = 0;
        int end = arr.length-1;
        int pivot = findPivot(arr);

        if(pivot==-1){
            return binarySearch(arr,target,start,end);
        }

        if(target < arr[start]){
            return binarySearch(arr, target, pivot+1, end);
        }
        else{
            return binarySearch(arr, target, start, pivot);
        }

    }

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

    //For duplicate elemnets 
    
    /* static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were the pivot??
                // check if start is pivot
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }  */

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.print("Pivot = ");
        System.out.println(findPivot(arr));
        System.out.print("Index of target element = ");
        System.out.println(searchInRotatedArray(arr, 4));
    }
}
