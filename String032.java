import java.util.*;

public class String032 {
    public String solution(String str){
        String answer = "";
        int m=Integer.MIN_VALUE, pos;  //초기에는 가장 작은 값으로 초기화
        //indexof, substring 사용
        while((pos = str.indexOf(' ')) != -1){  //첫번째로 발견되는 띄어쓰기의 위치 반환. 발견 못 하면 -1 반환
            String tmp = str.substring(0, pos); //0부터 pos전까지 자르기
            int len = tmp.length();
            if(len > m){ // >=로 하면 뒤쪽 단어가 선택되므로 반드시 >로 해야함
                m = len;
                answer = tmp;
            }
            str = str.substring(pos+1); //잘라낸 단어 없애기
        }
        if(str.length()>m) answer = str;  //마지막 단어 처리
        return answer;
    }

    public static void main(String[] args){
        String032 T = new String032();
        Scanner kb = new Scanner(System.in);
        String str=kb.nextLine();  //단어가 아닌 한 줄 입력
        System.out.print(T.solution(str));
        kb.close();
    }
}
