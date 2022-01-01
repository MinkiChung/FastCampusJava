package ch15;

public class TakeTrans {
    public static void main(String[] args) {
        Person p1 = new Person("Edward", 20000);
        Taxi t1 = new Taxi("잘 간다 운수택시");

        p1.takeTaxi(t1);

        p1.showInfo();
        t1.showInfo();

    }
}