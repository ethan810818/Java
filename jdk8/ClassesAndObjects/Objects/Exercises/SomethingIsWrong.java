package ClassesAndObjects.Objects.Exercises;

public class SomethingIsWrong {
    public static void main(String[] args) {
        Rectangle myRect = new Rectangle();

        myRect.width = 40;
        System.out.println("width is: " + myRect.width);
        myRect.height = 50;
        System.out.println("height is: " + myRect.height);

        System.out.println("myRect's area is " + myRect.area());
    }
}
