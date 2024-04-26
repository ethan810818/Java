package OOP.Exercises.One;

import OOP.Exercises.Two.VietNam;

public class Human implements VietNam {
    private String adn;
    private String name;
    private Boolean isMale;
    private int age;

    public String setADN(String adn) {
        return this.adn = adn;
    }

    public String setName(String name) {
        return this.name = name;
    }

    public Boolean setIsMade(Boolean isMale) {
        return this.isMale = isMale;
    }

    public int setAge(int age) {
        return this.age = age;
    }

    public void summaryInfo(){
        System.out.println(
        "Summary information is:\n" 
        + "\nadn: " + adn
        + "\nname: " + name
        + "\nisMale: " + isMale
        + "\nage: " + age
        );
    }

    public void work(String name) {
        System.out.println("My work is: " + name);
    }
    public void play(String name) {
        System.out.println("My sport is: " + name);
    }
    public void sleep(int hours) {
        System.out.println("I sleep " + hours + " hour in a day");
    }
    public void run(int kilometer) {
        System.out.println("I run " + kilometer + " around my apartment in the morning" );
    }
    public void eat(String name) {
        System.out.println("I eat " + name);
    }
    public void drink(String name) {
        System.out.println("I drink " + name);
    }
}
