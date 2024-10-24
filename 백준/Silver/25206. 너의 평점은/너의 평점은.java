import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double cnt = 0;//학점의 총합
        Map<String,Double> map = new HashMap<>();
        map.put("A+",4.5);
        map.put("A0",4.0);
        map.put("B+",3.5);
        map.put("B0",3.0);
        map.put("C+",2.5);
        map.put("C0",2.0);
        map.put("D+",1.5);
        map.put("D0",1.0);
        map.put("F",0.0);
        double total = 0.0;
        while(in.hasNext()){
            String subject = in.next();
            double score = Double.parseDouble(in.next());
            
            String alpha = in.next();
            if(alpha.equals("P")){
                continue;
            }
            cnt+=score;
            total +=(map.get(alpha)*score);
   
            in.nextLine();
           
        }
        
        System.out.println(total/cnt);
    }
}