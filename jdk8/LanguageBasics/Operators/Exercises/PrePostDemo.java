package LanguageBasics.Operators.Exercises;

public class PrePostDemo {
    public void prePostDemo() {
        int i = 3;
        i++;
        System.out.println(i);
        ++i;
        System.out.println(i);
        System.out.println(++i);// in ra 6 vì:  ++ sau đó in ra giá trị
        System.out.println(i++);//6 in ra 6 vì: In ra giá trị hiện tại sau đó ++
        System.out.println(i);
    }
}
