//Print the position/index of the first and last occurrences of a character e.g. 'a'

//          "abaacdaefaah"  ->     First a is at 0th index
//                          ->     last a is at 10th index


public class recursion_1 {
    public static int first =-1;
    public static int last = -1;
    public static void findOccurrence( int index, char element , String str){
        if(index==str.length()-1){
            System.out.println("First " + element + " is at " + first);
            System.out.println("Last " + element + " is at " + last);
            return;
        }
        char currChar=str.charAt(index);
        if(currChar==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        findOccurrence(index+1, element, str);
    }
    public static void main(String args[]){
        String str = "abaacdaefaah";
        char element = 'a';
        findOccurrence(0 , element,str);
    }
}
