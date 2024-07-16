import java.util.HashMap;
import java.util.Map;

class Solution {
    // 모스 부호와 영어 소문자의 대응 관계를 저장할 맵을 초기화합니다.
    private static final Map<String, Character> morseToAlphabet = new HashMap<>();

    static {
        // 알파벳과 모스 부호 배열
        String[] morseCodes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        
        // 매핑 초기화
        for (int i = 0; i < morseCodes.length; i++) {
            morseToAlphabet.put(morseCodes[i], alphabet.charAt(i));
        }
    }

    public String solution(String letter) {
        // 공백을 기준으로 모스 부호를 분할합니다.
        String[] trans = letter.split(" ");
        StringBuilder answer = new StringBuilder();

        for (String morseLetter : trans) {
            // 모스 부호를 알파벳 문자로 변환합니다.
            Character decodedChar = morseToAlphabet.get(morseLetter);
            if (decodedChar != null) {
                answer.append(decodedChar);
            }
        }
        
        return answer.toString();
    }}

 