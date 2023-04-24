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
    public void choiceMode() {
        System.out.println("모드를 선택해주세요 \n 1: 판매자\n 2: 소비자");
        selectMode = scan.nextInt();
    }

    /*비밀번호 확인*/
    public void checkPassword() {
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

    /*음료 추가*/
    public void addDrink() {
        for (int i = 0; i < MACHINE_SIZE; i++) {
            System.out.println("음료 이름을 입력해주세요");
            String drinkName = scan.nextLine();
            System.out.println("가격을 입력해주세요");
            int drinkCost = scan.nextInt();
            System.out.println("수량을 입력해주세요");
            int drinkQuantity = scan.nextInt();
            products[i] = new Product(drinkName, drinkCost, drinkQuantity);
        }
    }

    /*자판기 음료 디스플레이*/
    public void showDrink() {
        for (int i = 0; i < MACHINE_SIZE; i++) {
            if (products[0] == null) {
                System.out.println("현재 재고가 없습니다.");
                break;
            }
            System.out.printf("[%d] - 음료: %s, 가격: %d, 재고: %d", i + 1, products[i].getDrink(), products[i].getCost(), products[i].getQuantity());
        }
    }
}