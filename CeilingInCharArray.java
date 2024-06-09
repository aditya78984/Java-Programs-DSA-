public class CeilingInCharArray {
    public static char ceiling(char arr[] , char target){
        int start=0 , end=arr.length-1 , mid;
        
        while(start<=end){
            mid=(start+end)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            
        }
        return arr[start%arr.length];
    }
    public static void main(String[] args) {
       char arr[]={'c','f','j'};
        char ans = ceiling(arr, 'l');
        System.out.println(ans);
    }
    
        
    
    
}
