import java.util.Scanner;

public class String051 {
    public String Solution(String str){
        String answer;
        char[] s=str.toCharArray();  //문자 배열 생성
        int lt=0, rt=str.length()-1;
        while(lt<rt){
            //문자가 알파벳이 아니라면 lt++, rt--
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if(!Character.isAlphabetic(s[rt])) rt--;
            else{
                char tmp=s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        //s배열을 String으로 바꿈
        answer=String.valueOf(s);
        return answer;
    }

    public static void main(String[] args) {
        String051 T = new String051();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.Solution(str));


        kb.close();
    }
}
