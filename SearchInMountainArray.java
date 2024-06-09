public class SearchInMountainArray {
    public static int search(int arr[] , int target){

        int start = 0;
        int end = arr.length - 1;
        int peak = peakIndex(arr);

        int asc = orderAgnosticsBS(arr, target, start, peak);            //40,50,60,70,80,35,30,18,15,8,4
        int desc = orderAgnosticsBS(arr, target, peak + 1, end);

        if(asc!=-1){
            return asc;
        }
        else if(desc!=-1){
            return desc;
        }
        else{
            return -1;
        }

    }

    public static int peakIndex(int arr[] ){
        int start = 0;
        int end = arr.length-1;

        while(start!=end){
            int mid = (start + end)/2;

            if(arr[mid]>arr[mid + 1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }

        }
        return start;
    }

    public static int orderAgnosticsBS(int arr[],int num,int start,int end){

        boolean isAsc = arr[start] < arr[end];

        if(isAsc){
            while(end>=start){
                int mid=start + (end-start)/2;
                if(arr[mid]>num){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
                if(arr[mid]==num){
                    return mid;
                }
            }
            return -1;
        }

        else{
            while(end>=start){
                int mid=start + (end-start)/2;
                if(arr[mid]>num){
                    start=mid+1;
                }
                else if(arr[mid]<num){
                    end=mid-1;
                }
                if(arr[mid]==num){
                    return mid;
                }
            }
            return -1;
        }
    }
        
    public static void main(String[] args) {
        int arr[] = {40,50,60,70,80,35,30,18,15,8,4};
        System.out.println(search(arr, 500));
        
    }
}
