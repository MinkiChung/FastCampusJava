package ch08_2;

public class Delivery {
    Long orderNum;
    int orderPhoneNum;
    String orderAddress;
    int orderDate;
    int orderTime;
    int orderPrice;
    String MenuNum;

    Delivery(Long orderNum, int orderPhoneNum, String orderAddress, int orderDate, int orderTime, int orderPrice, String MenuNum) {
        this.orderNum = orderNum;
        this.orderPhoneNum = orderPhoneNum;
        this.orderAddress = orderAddress;
        this.orderDate = orderDate;
        this.orderTime = orderTime;
        this.orderPrice = orderPrice;
        this.MenuNum = MenuNum;
    }

    void printInfo() {
        System.out.println("주문 접수 번호 : " + orderNum);
        System.out.println("주문 핸드폰 번호 : " + orderPhoneNum);
        System.out.println("주문 집 주소 : " + orderAddress);
        System.out.println("주문 날짜 : " + orderDate);
        System.out.println("주문 시간 : " + orderTime);
        System.out.println("주문 가격 : " + orderPrice);
        System.out.println("메뉴 번호 : " + MenuNum);

    }
}
