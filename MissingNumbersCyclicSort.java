import java.util.*;

public class MissingNumbersCyclicSort {

    public static void swap(int[] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static List<Integer> missingNumbers(int[] arr){
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]-1 ;
            if(arr[i] != arr[correct]){
                swap(arr , i , correct);
            }
            else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int j=0 ; j<arr.length ; j++)
        {
            if(arr[j] != j+1){
                ans.add(j+1);
            }
        }
        return ans;
    }

    public static void main(String args[]){
        int arr[]={4,3,2,7,8,2,3,1};
        List<Integer> ans = new ArrayList<>();
        ans=missingNumbers(arr);
        for(int i: ans){
            System.out.println(i);
        }
    }  
}
