class NumOfOccurrencesRecursion {
    
    public static int numOfOccur(int[] arr , int key , int start , int end , int ans , boolean startIndex){
        if(start>end){
            return ans ;
        }
        int mid = end + (start - end)/2 ;
        if(key>arr[mid]){
            return numOfOccur(arr,key,mid+1,end,ans,startIndex) ;
        }
        else if(key<arr[mid]){
            return numOfOccur(arr,key,start,mid-1,ans,startIndex) ;
        }
        else{
            ans = mid ;
            if(startIndex){
                return numOfOccur(arr,key,start,mid-1,ans,startIndex) ;
            }
            else{
                return numOfOccur(arr,key,mid+1,end,ans,startIndex) ;
            }
        }
    }
       
        
    
    public static int count(int[] arr, int n, int x) {
        // code here
        int start = numOfOccur(arr,x,0,n-1,-1,true) ;
        int end = numOfOccur(arr,x,0,n-1,-1,false) ;
        return end-start+1 ;
        
    }
    public static void main(String[] args) {
        int[] arr={1,1,2,2,2,2,2,2,2,3};
        System.out.println(count(arr,arr.length,2));
    }
}
