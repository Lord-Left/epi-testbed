import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

/* recursive implementation of permutations generator */

public class fifteenThree {

    public static void main(String[] args) {
        
        List<List<Integer>> returnList = new ArrayList<>();
        ArrayList<Integer> testList = new ArrayList<>(Arrays.asList(1,2,3,4));
        permutationGenerator(0, testList, returnList);

        System.out.println(returnList);
        
        
    }

    public static void permutationGenerator(int index, List<Integer> elementList, List<List<Integer>> retList) {

        // if we reach last element of elementList, add all those elements to retList 
        if (index == elementList.size()-1) {
            retList.add(new ArrayList<>(elementList));
            return;
        }

        // otherwise, apply permutationGenerator recursively
        for(int j = index; j < elementList.size(); ++j) {
            Collections.swap(elementList, index, j);
            permutationGenerator(index + 1, elementList, retList);
            Collections.swap(elementList, index, j);

        }



    }


}