public class CyclicSort {

    public static void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void cyclicSort(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
    }

    public static void printArray(int arr[]){
        for(int element:arr){
            System.out.print(element + " ");
        }
    }

    public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        cyclicSort(arr);
        printArray(arr);
        
        
    }
}


