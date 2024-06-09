public class FirstOccurrenceRecursion {
    public static int firstOccur(int[] arr , int i , int target){
        if(i>arr.length-1){
            return -1 ;
        }
        if(arr[i] == target){
            return i ;
        }
        return firstOccur(arr, i+1, target) ;
    }
    public static void main(String[] args) {
        int[] arr = {8,3,6,9,10,2,95,3} ;
        System.out.println(firstOccur(arr, 0, 5));
    }
}
