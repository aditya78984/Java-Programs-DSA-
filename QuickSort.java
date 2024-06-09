public class QuickSort {
    public static int partition(int[] A , int low , int high){
        int pivot,i,j,temp;
        pivot=A[low];
        i=low+1;
        j=high;
        do{
            while(A[i]<=pivot){
                i++;
            }
            while(A[j]>pivot){
                j--;
            }
            if(i<j){
                temp=A[i];
                A[i]=A[j];
                A[j]=temp;
            }

        }while(i<j);
        temp=A[low];
        A[low]=A[j];
        A[j]=temp;
        return j;
    }
    public static void quickSort(int[] A ,int low , int high){
        if(low<high){
            
            int partitionindex = partition(A, low, high);
            quickSort(A,low,partitionindex-1);
            quickSort(A,partitionindex+1,high);

        }
    }

    public static void main(String[] args) {
        int[] A = {24,65,12,3,12,9,1,80};
        quickSort(A, 0, A.length-1);
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }

    }
}