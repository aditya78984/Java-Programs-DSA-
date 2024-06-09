public class InsertionSort {
    public static void insertionSort(int[] arr){
        for(int i=1 ; i<arr.length ; i++){

            int current = arr[i];
            int prev = i-1;
    
            while( prev>=0 && current < arr[prev]){
    
                arr[prev+1]=arr[prev];
                prev--;
            }
    
            //insertion
            arr[prev+1]=current;
        }
    }

    
    public static void printArray(int arr[]){
        for(int element:arr){
            System.out.print(element + " ");
        }
    }

    public static void main(String args[]){
    int arr[]={7,8,3,1,2};
    insertionSort(arr);

    

    
    printArray(arr);
}
}
