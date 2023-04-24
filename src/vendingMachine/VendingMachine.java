package vendingMachine;
import java.util.*;

public class VendingMachine {
    private Product[] products;
    private int MACHINE_SIZE = 3;
    private int PASSWORD = 0000;
    private int error;
    Scanner scan = new Scanner(System.in);

    /*비밀번호 확인 메서드*/
    public void checkPassword(){
        for (int i = 0; i < 3; i++) {
            System.out.println("비밀번호 입력");
            int inputPassword = scan.nextInt();
            if (PASSWORD != inputPassword) {
                System.out.println("비밀번호 오류");
                error++;                            //비밀번호 3번 틀릴시 자동종료
            }
            break;
        }
    }

}
