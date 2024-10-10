import java.util.*;
class Solution
{
    public String[] solution(String my_string)
    {
        my_string = my_string.trim(); // trim은 결과를 반환하므로 반드시 할당해야 함
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        
        while (my_string.length() > 0)
        {
            if (my_string.substring(0, 1).equals(" "))
            {
                if (sb.length() > 0)
                {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
                my_string = my_string.substring(1);
                continue;
            }
            else
            {
                sb.append(my_string.substring(0, 1));
            }
            my_string = my_string.substring(1); 
        }
        
        if (sb.length() > 0) // 마지막 남은 단어를 리스트에 추가
        {
            list.add(sb.toString());
        }

        return list.toArray(new String[0]); 
    }
}
