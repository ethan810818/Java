package InterfaceAndInheritance.inheritances;

// What You Can Do in a Subclass?
public class Parent {
    public int parentField = 10;

    public Parent() {
        System.out.println("Parent's Constructor");
    }

    public void parentMethod() {
        System.out.println("Parent Method Called");
    }

    public void printMessage() {
        System.out.println("Parent's Message");
    }

    public static void staticMethod() {
        System.out.println("Static Method of Parent");
    }


    // Private members in a Parent(Superclass)
    private int privateField = 10;

    public Parent(int value) {
        this.privateField = value;
    }

    private void privateMethod() {
        System.out.println("Parent's private method called");
    }

    public void accessPrivateField(int newValue) {
        this.privateField = newValue;
    }

    public void callPrivateMethod() {
        privateMethod();
    }
}

