import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] product = {"스프라이트", "코카콜라", "환타", "커피"};
        int[] price = {1500, 2000, 1000, 500};
        int[] quantity = {2, 3, 0, 1};
        int i = 0;
        int money = 0;
        int checkDrink;


        do {
            System.out.printf("[번호%d]제품: %s, 가격: %d, 재고: %d", i, product[i], price[i], quantity[i]);
            System.out.println("");
            i++;
        } while (i < product.length);

        while (true) {
                Scanner scan = new Scanner(System.in);
                System.out.println("계속 하시겠습니까? 계속: 0, 아니오: 1");
                int OK = scan.nextInt();
                if (OK == 1) {
                    System.out.println("안녕히가세요");
                    break;
                } else {
                    do {
                        int inputMoney;
                        System.out.println("돈을 넣어주세요");
                        inputMoney = scan.nextInt();
                        money = money + inputMoney;
                        do {
                            System.out.println("음료를 골라주세요");
                            checkDrink = scan.nextInt();
                            if (quantity[checkDrink] == 0) {
                                System.out.println("재고가 없습니다 다시 선택해주세요");
                            }
                        } while (quantity[checkDrink] == 0);
                        if (money < price[checkDrink]) {
                            System.out.println("돈이 부족합니다, 추가로 넣어주세요");
                        }
                        ;
                    } while (money < price[checkDrink]);
                    money = money - price[checkDrink];
                    quantity[checkDrink] = quantity[checkDrink] - 1;
                    System.out.printf("음료: %s, 잔돈:%d\n", product[checkDrink], money);
                }
            }

        }
    }
//추후 모든 재고 소진시 종료 기능 추가 예정(object, method.. 등 더 공부 할것)
//(최종?)나중에는 gui, object 등 이용해 판매자, 이용자 구분해서 활용할수 있게끔 할 예정