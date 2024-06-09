//Tower of Hanoi problem

public class TowerOfHanoi {
    public static void TOH(int n , String src , String helper , String destn){

        if(n==1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + destn);
            return;
        }
        TOH(n-1,src,destn,helper);
        System.out.println("Transfer disk " + n + " from " + src + " to " + destn);
        TOH(n-1,helper,src,destn);
    }

    public static void main(String args[]){
        int n=3;
        String src,destn,helper;
        src="A";
        helper="B";
        destn="C";
        TOH(n,src,helper,destn);
    }
}
