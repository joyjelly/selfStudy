package day0617;

public class arrayex {
	    public static void main(String[] args) {
	        // TODO: 크기가 5인 정수 배열을 선언하고 1부터 5까지의 값으로 초기화하세요.
	        // TODO: 배열의 모든 요소를 출력하세요.
	    	int [] arryInt = new int[5];
	    	for(int i =0;i<arryInt.length;i++) {
	    		arryInt[i] = i+1;
	    	}
	    	System.out.println(arryInt.toString());
	}
}
