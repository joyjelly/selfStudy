import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(String my_string, String letter) {
        String[] my_stringArr = my_string.split("");
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(my_stringArr));
        int i = 0;
        String answer = "";

        while (i < list.size()) {
            if (list.get(i).equals(letter)) {
                list.remove(i);
            } else {
                i++;
            }
        }

        for (String str : list) {
            answer += str;
        }

        return answer;
    }
}
