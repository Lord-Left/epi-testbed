import java.util.*;


public class numPowerSet {
    
    public static void main(String[] args) {
        
        int[] nums = {2,3,5};
        int t = 8;

        List<List<Integer>> result = new ArrayList<>();
        genPS(nums, t, result, new ArrayList<>(), true);

        System.out.println(result);


    }

    public static void genPS (int[] num, int target, List<List<Integer>> list, List<Integer> tmp, boolean keepExploring) {

        if(sumArray(tmp) == target) {
            list.add(new ArrayList<Integer>(tmp));
            keepExploring = false;
        } else if (sumArray(tmp) > target) {
            keepExploring = false;
        }

        if(keepExploring) {

            for(int i = 0; i < num.length; i++) {


                if(!tmp.isEmpty() && num[i] >= tmp.get(tmp.size()-1)) {
                    tmp.add(num[i]);
                    // System.out.println(num[i]);
                } else if(!tmp.isEmpty() && num[i] < tmp.get(tmp.size()-1)) {
                    continue;  
                } else {
                    tmp.add(num[i]);
                }

                // tmp.add(num[i]);

                genPS(num, target, list, tmp, keepExploring);
                tmp.remove(tmp.size()-1); // un-choose last option
            }


        }

    }

    // helper method to sun values
    public static int sumArray(List<Integer> ls) {

        int ret = 0;

        for(int x: ls) {
            System.out.print(x + " ");
            ret += x;
        }

        return ret;
    }

    


}