public class wordLadder {


    public static void main(String[] args) {

    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
    
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