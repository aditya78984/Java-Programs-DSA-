public class LinearSearch {
    
    public static int linearSearch(int[]arr , int num){

        if (arr.length==0){
            return -1;
        }

        for(int i=0 ; i < arr.length ; i++){
            if(arr[i]==num){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={12,34,54,88,60,18};
        int ans = linearSearch(arr, 18);
        System.out.println(ans);
    }
}
