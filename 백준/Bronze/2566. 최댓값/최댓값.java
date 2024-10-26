import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int max = -1;
        int maxI = -1;
        int maxJ = -1;
        for(int i = 0; i<9;i++){
            for(int j = 0; j<9;j++){
                int a = in.nextInt();
                arr[i][j]=a;
                if(max<a){
                    max = a;
                    maxI = i+1;
                    maxJ = j+1;
                }
            }
        }
        
        
        System.out.println(max);
        System.out.println(maxI+" "+maxJ);
    }
}