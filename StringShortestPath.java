public class StringShortestPath {
    public static int shortestPath(String str){
        int N = 0;
        int S = 0;
        int E = 0;
        int W = 0;

        for(int i = 0 ; i < str.length() ; i++){
            if ( str.charAt(i) == 'N'){
                N++;
            }
            if ( str.charAt(i) == 'S'){
                S++;
            }
            if ( str.charAt(i) == 'E'){
                E++;
            }
            if ( str.charAt(i) == 'W'){
                W++;
            }
            
        }
        int y = N - S;
            int x = E - W;
            int z = x*x + y*y;
            int ans = (int)Math.sqrt(z);
            return ans;

    }
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str)); 
    }
}
