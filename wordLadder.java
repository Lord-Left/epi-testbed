import java.util.LinkedList;
import java.util.List;
import java.util.HashSet;


public class wordLadder {


    public static void main(String[] args) {

        LinkedList<String> wL = new LinkedList<>();
        wL.add("hot");
        wL.add("hat");
        wL.add("lot");
        wL.add("log");
        wL.add("cog");



    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        return 0;
    }

    public int wDiff(String f, String s) {
        int diff = 0;
        // now compare 2nd word against 1st
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == f.charAt(i)) {
            } else {
                diff++;
            }
        }
        return diff;
    }
}