import java.util.ArrayList;

import java.util.*;

public class String041 {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            //문자열을 다루는 class객체 만들고 뒤바꿔서 String으로 만들기
            //String으로 객체를 만들면 문자열을 변경할 수 없음
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String[] args){
        String041 T = new String041();
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
