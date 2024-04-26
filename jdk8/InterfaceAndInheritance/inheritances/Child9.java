package InterfaceAndInheritance.inheritances;

public class Child9 extends Parent {
    public Child9(int value) {
        super(value);
    }

    public void modifyPrivateField() {
        accessPrivateField(100);
    }

    public void callSuperPrivateMethod() {
        callPrivateMethod();
    }
}
