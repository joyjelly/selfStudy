import java.util.Arrays;

class Solution {
    public int solution(String[] spell, String[] dic) {

        char[] spellArray = String.join("", spell).toCharArray();
        Arrays.sort(spellArray);
        String sortedSpell = new String(spellArray);
        
        for (String word : dic) {
       
            char[] wordArray = word.toCharArray();
            Arrays.sort(wordArray);
            String sortedWord = new String(wordArray);
            
          
            if (sortedSpell.equals(sortedWord)) {
                return 1;
            }
        }
        return 2;
    }
}
