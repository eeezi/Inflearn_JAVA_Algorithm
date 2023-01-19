import java.util.*;

public class String061 {
    public String solution(String str){
        String answer="";
        //index 사용하여 풀기
        for(int i=0; i<str.length(); i++){
            //indexOf 사용하여 문자가 최초로 등장하는 index 번호 출력
            //System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args){
        String061 T = new String061();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

        kb.close();
    }
}
