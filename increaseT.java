
public class increaseT {

    public static void main(String[] args) {
        int[] test = {5,4,3,2,1};
        System.out.println(increasingTriplet(test));
    }


    public static boolean increasingTriplet(int[] nums) {

            int lil = Integer.MAX_VALUE;
            int big = Integer.MIN_VALUE; 
            
            for(int x : nums) {
                if(x < lil) {
                    lil = x;
                    System.out.println(lil);
                }
                if(x > big) {
                    big = x;
                    System.out.println(big);
                }
                
                if (x < lil && x < big) {}
                    System.out.println(lil + " " + big + " " + x);
                    return true;
            }
            
            return false;

    }
        
}
