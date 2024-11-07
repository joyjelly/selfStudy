import java.util.*;
import java.io.*;
class Point implements Comparable<Point>{
    int x;
    int y;
    
    Point(){
        
    }
    
    Point(int x, int y ){
        this.x= x;
        this.y = y;
    }
    @Override
    public int compareTo(Point p){
        if(this.x == p.x){
            return Integer.compare(this.y, p.y);
        }else{
            return Integer.compare(this.x, p.x);
        }
    }
    
}

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader  br = new BufferedReader (new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Point[] points = new Point[n];
        for(int i = 0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            points[i] = new Point(x,y);
        }
        Arrays.sort(points);
        
          StringBuilder sb = new StringBuilder();
        for (Point point : points) {
            sb.append(point.x).append(" ").append(point.y).append("\n");
        }
        System.out.print(sb);
    }
    }