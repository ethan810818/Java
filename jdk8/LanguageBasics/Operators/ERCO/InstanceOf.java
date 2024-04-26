package LanguageBasics.Operators.ERCO;

public class InstanceOf {
    private Parent parent;
    private Child child;
    
    public void checkInstanceOf() {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();

        System.out.println("\nobj1 instanceOf Parent: " + (obj1 instanceof Parent));
        System.out.println("\nobj1 instanceOf Child: " + (obj1 instanceof Child));
        System.out.println("\nobj1 instanceOf MyInterface: " + (obj1 instanceof MyInterface));

        System.out.println("\nobj2 instanceOf Parent: " + (obj2 instanceof Parent));
        System.out.println("\nobj2 instanceOf Child: " + (obj2 instanceof Child));
        System.out.println("\nobj2 instanceOf MyInterface: " + (obj2 instanceof MyInterface));

    }
}
