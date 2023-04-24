package vendingMachine;

public class Product {
    private String drink;
    private int cost;
    private int quantity;

    /*drink 정보 입력*/
    public Product(String drink, int cost, int quantity){
        this.drink = drink;
        this.cost = cost;
        this.quantity = quantity;
    }

    /*판매자로 부터 음료수 입력 받는 메소드*/
    String getDrink(){
        return drink;
    }

    int getCost(){
        return cost;
    }

    int getQuantity(){
        return quantity;
    }
}
