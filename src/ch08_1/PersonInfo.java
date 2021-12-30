package ch08_1;

public class PersonInfo {
    int height;
    int weight;
    String name;
    int age;

    PersonInfo(int height, int weight, String name, int age){
        this.height = height;
        this.weight = weight;
        this.name = name;
        this.age = age;
    }

    void printPersonInfo() {
        System.out.println("키가 " + height + "이고 몸무게가 " + weight + "킬로인 남성이 있습니다. 이름은 " + name +"이고 나이는 " +age +"세입니다.");
    }
}
