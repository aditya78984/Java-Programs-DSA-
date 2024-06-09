public class DiagonalMatrix {
    public static int sumOfDiagonals(int[][] arr){
        
        int n = arr.length;
        int sum = 0;
        
        
        for(int i=0 ; i<n ; i++){
            //Sum of Primary diagonal
            //Here indices i=i
            sum+=arr[i][i];

            //Sum of secondary diagonal
            //Here indices i+j=n-1  -> j=n-1-i
            if(i!=n-1-i){
                sum+=arr[i][n-1-i];
                
            }

        }
        return sum;
        
        
    }
    public static void main(String[] args) {
        int[][] arr = {
                        {10,20,30,40,50},
                        {60,70,80,90,100},
                        {110,120,130,140,150},
                        {160,170,180,190,200},
                        {210,220,230,240,250}
                        
                    };
        int ans = sumOfDiagonals(arr);
        System.out.println(ans);
    }
}
