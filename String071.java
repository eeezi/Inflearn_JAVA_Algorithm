import java.util.*;
public class String071 {
    public String solution(String str){
        String answer="YES";
        //문자열을 모두 대문자로 바꿈
        str = str.toUpperCase();
        int len = str.length();
        for(int i=0; i<len/2; i++)
            //i가 증가함에 따라 뒤에오는 문자열의 인덱스도 줄어들어야 함
            if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        String071 T = new String071();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

        kb.close();
    }

}
