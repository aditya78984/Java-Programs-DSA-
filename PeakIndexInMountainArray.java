public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int arr[] = {40,50,60,70,80,35,30,18,15,8,4};
        System.out.println(peakIndex(arr));
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
}
