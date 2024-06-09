public class Is_array_sorted_or_not {
    public static void main(String args[]){
        int arr[]={3,6,112,51,88};
        boolean isSorted=true;
        for(int i=0;i<(arr.length-1);i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
            }
            
        }
        System.out.print(isSorted);
    }
}
