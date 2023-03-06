import java.util.*;

public class String072 {
    public String solution(String str){
        String answer="NO";
        //StringBuilder로 뒤집어진 문자열 생성
        String tmp = new StringBuilder(str).reverse().toString();
        //equals 사용하여 비교 (대소문자 구분)
        //equalsIgnoreCase (대소문자 구분X)
        if(str.equalsIgnoreCase(tmp)) answer="YES";
        return answer;
    }

    public static void main(String[] args) {
        String072 T = new String072();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

        kb.close();
    }

}
