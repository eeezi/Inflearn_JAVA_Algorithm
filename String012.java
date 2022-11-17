import java.util.Scanner;

public class String012 {
    public int solution(String str, char t){
        int answer=0;
        str = str.toUpperCase(); //string 대문자로 변환
        t = Character.toUpperCase(t); //character클래스 사용하여 대문자로 변환
        //향상된 for문(for each) 사용
        for(char x: str.toCharArray()){ //string은 안됨 배열이나 리스트로 변환
            if(x == t) answer++;
        }
        return answer;
    }
    public static void main(String[] args){
        String012 T = new String012(); //solution 메소드는 non-static이라서 class 객체 생성
        Scanner kb = new Scanner(System.in);
        String str = kb.next(); //콘솔로 문자열 읽음
        char c = kb.next().charAt(0); //문자 하나만 읽어옴. charAt: 스트링을 인덱스로 접근
        System.out.print(T.solution(str, c));
    }
}
