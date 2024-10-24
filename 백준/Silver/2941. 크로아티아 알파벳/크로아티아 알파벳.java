import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
       
        String[] arr = {"c=","c-","dz=","d-","lj","nj","s=","z="};
        int cnt = 0;
        while(a.length()>0){
    boolean found = false;
    for(int i =0; i<arr.length;i++){
        if(a.startsWith(arr[i])){
            found = true;
            if(i==2){
                a = a.substring(3);  // dz=인 경우 3글자 제거
            }else{
                a = a.substring(2);  // 나머지는 2글자 제거
            }
            break;
        }
    }
    if(!found){
        a = a.substring(1);  // 크로아티아 알파벳이 아니면 1글자만 제거
    }
    cnt++;
}
        System.out.print(cnt);
        
    }
}