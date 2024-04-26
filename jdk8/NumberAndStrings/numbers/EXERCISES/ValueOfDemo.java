package NumberAndStrings.numbers.EXERCISES;

public class ValueOfDemo {
    public Integer valueOfMethod(int... numbers) {
        int total = 0;
        if (numbers.length >= 2) {
            for (Integer number: numbers) {
                total += number;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        ValueOfDemo demo = new ValueOfDemo();
        demo.valueOfMethod(1, 2, 3, 4, 5);
    }
}
