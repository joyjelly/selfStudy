import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader  br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> words = new HashSet<>();
        
        for(int i =0; i<n ; i++){
            words.add(br.readLine());//중복제거
        }
        
        List<String> list = new ArrayList<>(words);
        
        Collections.sort(list, (a,b) ->{
            if(a.length()==b.length()){
                return a.compareTo(b);
            }else{
                return Integer.compare(a.length(),b.length());
            }
        });
         StringBuilder sb = new StringBuilder();
        for (String word : list) {
            sb.append(word).append("\n");
        }
        System.out.print(sb);
        
    }
    }