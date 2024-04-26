package OOP.Exercises.One;

import java.math.BigDecimal;

import OOP.Exercises.Two.Iphone;

public class Phone implements Iphone {
    private String brand;
    private String name;
    private BigDecimal amount;

    public void call(String phoneNumber) {
        System.out.println("Phone number is: " + phoneNumber);
    }
    public void chat() {}
    public void watchYoutube() {}
    public void playGame() {}

}
