import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (char temp : s.toCharArray()) {
            if (!map.containsKey(temp)) {
                map.put(temp, 1);
            } else {
                map.put(temp, map.get(temp) + 1);
            }
        }
        
        List<Character> oneTimeChars = new ArrayList<>();
        
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                oneTimeChars.add(entry.getKey());
            }
        }
        
        Collections.sort(oneTimeChars);
        
        StringBuilder sb = new StringBuilder();
        for (char c : oneTimeChars) {
            sb.append(c);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
