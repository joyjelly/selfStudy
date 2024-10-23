import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int[] arr = new int[26];
        
        for(int i = 0 ; i<26; i++){
            
            
           arr[i] =-1;
        }
        
        
        char[] c = str.toCharArray();
        for(int i = 0; i<str.length();i++){
            int idx = (int)c[i];
            arr[idx-97] = str.indexOf(idx);
        }
        for(int i = 0 ; i<26; i++){
            
            
            System.out.print(arr[i]+" ");
        }
        
        
    }
}