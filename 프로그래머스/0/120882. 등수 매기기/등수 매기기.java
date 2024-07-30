import java.util.*;

class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;

        // 학생의 평균 점수와 해당 학생의 인덱스를 담는 리스트
        List<double[]> averageWithIndex = new ArrayList<>();

      
        for (int i = 0; i < n; i++) {
            double average = (score[i][0] + score[i][1]) / 2.0;
            averageWithIndex.add(new double[] {average, i});
        }

    
        averageWithIndex.sort((a, b) -> Double.compare(b[0], a[0]));


        int[] answer = new int[n];


        int rank = 1;
        for (int i = 0; i < n; i++) {
        
            int studentIndex = (int) averageWithIndex.get(i)[1];
            answer[studentIndex] = rank;

       
            if (i < n - 1 && averageWithIndex.get(i)[0] == averageWithIndex.get(i + 1)[0]) {
                continue;
            }

            rank = i + 2;
        }

        return answer;
    }
}
