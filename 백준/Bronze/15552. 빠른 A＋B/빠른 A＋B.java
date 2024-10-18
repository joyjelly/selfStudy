import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   
        StringTokenizer st ;
        
        int a = Integer.parseInt(bf.readLine());
        
        for(int i =0; i< a; i++){
            
              st  = new StringTokenizer(bf.readLine());
            bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.flush(); 
        bw.close(); 
        bf.close(); 
        
    }
}