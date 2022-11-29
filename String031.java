import java.util.*;

public class String031 {
    public String solution(String str){
        String answer = "";
        int m=Integer.MIN_VALUE;  //초기에는 가장 작은 값으로 초기화
        String[] s = str.split(" ");  //띄어쓰기로 구분해서 String배열에 저장
        for(String x : s){
            int len = x.length();  //각각의 단어의 길이가 저장됨
            if(len > m){  //가장 긴 길이로 업데이트
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        String031 T = new String031();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();  //단어가 아닌 한 줄 입력
        System.out.print(T.solution(str));
        kb.close();
    }
}
