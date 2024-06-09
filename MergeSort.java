public class MergeSort {
    public static void merge(int A[] , int low ,int mid , int high ){
        int[] B = new int[high+1];
        int i,j,k;
        i=low;
        k=low;
        j=mid+1;
        while(i<=mid && j<=high){
            if(A[i]<A[j]){
                B[k]=A[i];
                i++;
                k++;
            }
            else{
                B[k]=A[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
            B[k]=A[i];
            k++;
            i++;
        }
        while(j<=high){
            B[k]=A[j];
            k++;
            j++;
        }
        for(int x=low; x<=high ; x++){
            A[x]=B[x];
        }

    }

    public static void mergeSort(int[] A , int low , int high){
        int mid;
        if(low<high){
             mid = (low+high)/2;
            mergeSort(A,low,mid);
            mergeSort(A,mid+1,high);
            merge(A, low, mid, high);
        }
    }

    public static void main(String[] args) {
        int[] A = {40,11,54,11,8,2,90,16,56};
        mergeSort(A, 0, A.length-1);
        for(int x=0; x<A.length ; x++){
            System.out.print(A[x]+ " ");
        }
    }
}
