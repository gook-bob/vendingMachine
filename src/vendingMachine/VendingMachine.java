package vendingMachine;
import java.util.*;

public class VendingMachine {
    private int MACHINE_SIZE = 3;
    private Product[] products = new Product[MACHINE_SIZE];
    private int PASSWORD = 0000;
    private int error;
    private int selectMode;
    Scanner scan = new Scanner(System.in);

    /*모드 설정*/
    public void choiceMode(){
         System.out.println("모드를 선택해주세요 \n 1: 판매자\n 2: 소비자");
         selectMode = scan.nextInt();
    }

    /*재고 확인 메서드*/
    public void checkQuantity(){
        int totalQuantity = 0;
        for (int i= 0; i < MACHINE_SIZE; i++){
            totalQuantity += products[i].getQuantity();
        }
        if (totalQuantity == 0){
            System.out.println("현재 재고가 없습니다");
        }
    }

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

    //

}
