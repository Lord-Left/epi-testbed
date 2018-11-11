import java.util.*;

public class fifteenFour {

    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>(Arrays.asList(0,1,2,3));
        List<List<Integer>> total = new ArrayList<>();
        powerSet(input, 0, new ArrayList<Integer>(), total);
        System.out.println(total);
    }

    public static void powerSet(List<Integer> inputList, int selected, List<Integer> selectedSoFar, List<List<Integer>> retList) {

        if (selected == inputList.size()) {
            retList.add(new ArrayList<>(selectedSoFar));
            // System.out.println(selectedSoFar);
            return;
        }

        // add the excluded element
        selectedSoFar.add(inputList.get(selected));
        // apply powerset to included elements
        powerSet(inputList, selected+1, selectedSoFar, retList);
        // remove excluded element
        selectedSoFar.remove(selectedSoFar.size() - 1);
        powerSet(inputList, selected+1, selectedSoFar, retList);

    }
}