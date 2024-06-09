import java.util.* ;
public class sample {
    public static void main(String[] args) {
        int[] arr = {73, 192, 35 ,230 ,353 ,154, 272 ,378, 370 ,378 ,461, 500, 134, 361, 168 ,9 ,25 ,166 ,419 ,244 ,188 ,401 ,394 ,227 ,173 ,315 ,37} ;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0 ; i<21 ; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
