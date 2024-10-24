import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        
      String[] arr = {"","ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
        int cnt = 0;
        char[] c = a.toCharArray();
        for(int i = 0; i <c.length;i++){
            for(int j = 0; j<arr.length;j++){
                if(arr[j].contains(String.valueOf(c[i]))){
                    cnt += j+2;
                    break;
                }
            }
        }
       
        System.out.println(cnt);
    }
}