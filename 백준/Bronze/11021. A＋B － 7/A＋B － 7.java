import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {     
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());

     
        StringTokenizer st;
      
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            // 두 정수의 합을 출력 (bw 사용)
            bw.write("Case #"+(i+1)+": "+(a + b)+ "\n");
        }

        // 버퍼 비우기 및 종료
        bw.flush();
        bw.close();
        br.close();
    }
}
