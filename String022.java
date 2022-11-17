import java.util.*;
public class String022 {
    public String solution(String str){
        String answer="";
        for(char x : str.toCharArray()){
            //ASCII number 사용
            //A to Z: 65~90
            //a to z: 97~122
            if(x>=97 && x<=122) //소문자범위. 연산자 넣으면 숫자로 인식함
                answer += (char)(x-32); //char로 형변환
            else answer += (char)(x+32);
        }
        return answer;
    }

    public static void main(String[] args){
        String022 T = new String022();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
    
}
