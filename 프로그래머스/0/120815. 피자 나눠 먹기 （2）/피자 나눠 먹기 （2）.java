class Solution {
  
        private int gcd(int a, int b){
            while(b!=0){
                int temp=b;
                b = a%b;
                a = temp;
            }
            return a;
        }
        
        private int lcm(int a,int b){
            return a * (b / gcd(a, b));
        }
        public int solution(int n){
            int num = 6;
            int lcm = lcm(num,n);
            int answer = lcm / num;
            return answer;
        }
    }
