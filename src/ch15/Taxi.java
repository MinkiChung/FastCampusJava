package ch15;

public class Taxi {
    int money;
    String taxiBrand;

    Taxi(String taxiBrand) {
        this.taxiBrand = taxiBrand;
    }

    public void take(int money) {
        this.money += money;
    }

    public void showInfo() {
        System.out.println(taxiBrand + " 수입은 " + money + "원 입니다.");
    }
}
