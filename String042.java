import java.util.ArrayList;
import java.util.*;

public class String042 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
           //문자 하나하나 교환하는 방법 사용
           char[] s = x.toCharArray();
           int lt=0, rt=x.length()-1;
           while(lt<rt){
            char tmp = s[lt];
            s[lt] = s[rt];
            s[rt] = tmp;
            lt++;
            rt--;
           }
           String tmp = String.valueOf(s);
           //s를 String화 시켜줌. valueOf는 static method임.
           answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        String042 T = new String042();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();  //단어 개수 입력
        String[] str = new String[n];  //동적으로 String 배열 만들기
        for(int i=0; i<n; i++){
            str[i] = kb.next();  //배열에 단어 하나씩 넣기
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
        kb.close();
    }
}
