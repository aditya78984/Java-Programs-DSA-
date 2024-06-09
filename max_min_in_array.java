public class max_min_in_array{
    public static void main(String args[]){
        int arr[]= {858,34,0,22,9,51};
        int min , max ;
        min=arr[0];
        max=arr[0];
        for (int i = 0; i<arr.length ; i++){
            if (min > arr[i]){
                min=arr[i];
            }
            if (max < arr[i]){
                max=arr[i];
            }
        }
        System.out.printf("Max value : %d \nMin value : %d",max,min);
    }
}