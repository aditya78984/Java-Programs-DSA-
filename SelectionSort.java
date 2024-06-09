public class SelectionSort {

    public static void selectionSort(int arr[]){

        int size=arr.length;
        
        for(int i=0 ; i<size-1 ; i++){
            
            int index_of_smallest = i;

            for(int j=i+1 ; j<size ; j++){

                if( arr[index_of_smallest] > arr[j]) {
                    index_of_smallest = j;
                }       

            }
            //swap
            int temp=arr[i];
            arr[i]=arr[index_of_smallest];
            arr[index_of_smallest]=temp;
        }
    }

    public static void printArray(int arr[]){
        for(int element:arr){
            System.out.print(element + " ");
        }
    }


    public static void main(String args[]){
        
        int arr[] = {5,9,2,10,1};
        System.out.println("The original array is : ");
        printArray(arr);
        selectionSort(arr);
        System.out.println("\nThe array afte sorting is :  ");
        printArray(arr);
    }
}
//Time complexity of selection sort = O(n^2)

//Selection sort can be remmebered as - one swap per one iteration 