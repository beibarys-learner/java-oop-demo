package kz.java.oop.demo;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.drive();
        Car bmw = new Car();
        bmw.stop();

        System.out.println(nissan.color);
        System.out.println(bmw.color);

    }
}

