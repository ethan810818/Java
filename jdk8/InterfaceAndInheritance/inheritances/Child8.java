package InterfaceAndInheritance.inheritances;

public abstract class Child8 extends Parent {
    public Child8() {
        super();// Call the constructor of the parent class
        System.out.println("Child8's Constructor");
    }

    abstract void abstractMethod(int x, int y);
}
