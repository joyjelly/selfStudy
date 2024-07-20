import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        int i =0;
        String[] ansArr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        List<String> list= new ArrayList<String>(Arrays.asList(ansArr));
        while(i<list.size()){
            if(list.get(i).equals("a")||list.get(i).equals("e")||list.get(i).equals("i")||list.get(i).equals("o")||list.get(i).equals("u")){
    list.remove(i);
                i--;
            }
            i++;
        }
        for(String temp:list){
            sb.append(temp);
        }
        return sb.toString();
    }
}