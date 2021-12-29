package ch07;


import java.util.InputMismatchException;

public class SwitchCaseTest {

    public static void main(String[] args) {
        Prompt p = new Prompt();
        while (true) {
            try {
                p.InputMonth();
            } catch (InputMismatchException ex) {
                System.out.println("잘못된 입력입니다!");
                break;
            }
        }
    }
}

// Memo: 아무 문자열을 입력했을 때가 아니라 exit과 같이 특정 문자열을 입력했을 떄 프로그램 종료되게 하려면 Prompt Class에서 int가 아니라 String으로 숫자를 입력받고
// switch-case문에서도 특정 String이 입력됐을 때 프로그램 종료되게 하면 되지 않을까?