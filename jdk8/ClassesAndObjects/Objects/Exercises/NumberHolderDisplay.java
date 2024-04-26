package ClassesAndObjects.Objects.Exercises;

public class NumberHolderDisplay {
    public static void main(String[] args) {
        NumberHolder numberHolder = new NumberHolder();
        numberHolder.anInt = 1;
        numberHolder.aFloat = 2.3f;
        
        System.out.println(numberHolder.anInt);
        System.out.println(numberHolder.aFloat);
    }
}
