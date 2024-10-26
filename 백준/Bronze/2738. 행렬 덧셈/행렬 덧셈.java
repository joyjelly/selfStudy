import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
         int b = in.nextInt();
        int[][] arr1 = new int[a][b];
        for(int i = 0 ; i <a;i++){
            for(int j =0; j<b;j++){
               int temp = in.nextInt();
            arr1[i][j] =temp;
            }
            
        }
         for(int i = 0 ; i <a;i++){
            for(int j =0; j<b;j++){
               int temp1 = in.nextInt();
            arr1[i][j] +=temp1;
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }
         
    }
}