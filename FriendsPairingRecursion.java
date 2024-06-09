public class FriendsPairingRecursion {
    public static int findWays(int n){
        if(n==1 || n==2 ){
            return n ;
        }

        int single = findWays(n-1) ;
        int pair = (n-1)*findWays(n-2);
        return single + pair ;
    }
    public static void main(String[] args) {
        System.out.println(findWays(4));
    }
}
