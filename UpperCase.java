public class UpperCase {
    public static StringBuilder upperCase(StringBuilder str){

        char ch = Character.toUpperCase(str.charAt(0));
        str.setCharAt(0, ch);
        
        for(int i = 1 ; i < str.length() ; i++){
            if(str.charAt(i) == ' ' && i!=str.length()-1){
                char temp = Character.toUpperCase(str.charAt(i+1));
                str.setCharAt(i+1 , temp);
            }
        }
        return str;
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("there is dripping outside ");
        System.out.println(upperCase(sb));

    }
}
