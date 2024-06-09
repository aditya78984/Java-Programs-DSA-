public class BubbleSort {

    public static void bubbleSort(int arr[]){

        int size=arr.length;
        boolean isSorted = true;

        for(int i=0 ; i<size ; i++){

            for(int j=0 ; j<size-i-1 ; j++){
                
                if ( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    isSorted=false;
                }

            }
            if(isSorted){
                System.out.println("\nThe array is sorted"); 
                break;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int element:arr){
            System.out.print(element + " ");
        }
    }
    public static void main(String args[]){
        // int arr[] = {3,5,11,15,20,39};
        int arr[] = {13,65,110,15,2,39};
        System.out.println("The original array is : ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("\nThe array afte sorting is :  ");
        printArray(arr);
    }
}
//Time complexity of bubble sort = O(n^2)