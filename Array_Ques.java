public class Array_Ques {
    public static int evenInArray(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int even_digit_elements=0;
        for(int i=0 ; i<arr.length ; i++){
            int count=0;
            int n=arr[i];
            while (n>0){
                n=n/10;
                count++;
                
            }
            if(count%2==0){
                even_digit_elements++;
            }
        }
        return even_digit_elements;
    }

    public static void main(String[] args) {
        int[] arr={1,643,804,5,193};
        System.out.println(evenInArray(arr));
    }
}
