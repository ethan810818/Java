package InterfaceAndInheritance.inheritances;

public class Main {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        child1.printParentField();

        Child2 child2 = new Child2();
        System.out.println("parentField is " + child2.parentField);

        Child3 child3 = new Child3();
        System.out.println("childField is " + child3.childField);

        Child4 child4 = new Child4();
        child4.parentMethod();

        Child5 child5 = new Child5();
        child5.printMessage();

        // Child6 child6 = new Child6();
        Child6.staticMethod();
        Parent.staticMethod();

        Child7 child7 = new Child7();
        child7.child7Method();
        child7.child7Method1();
        child7.child7Method2();

        Child8 child8 = new Child8();

        Child9 child9 = new Child9(50);
        child9.modifyPrivateField();
        child9.callSuperPrivateMethod();

        child1.getClass().getSimpleName();
        child1.getClass().getSuperclass();
        child1.getClass().getInterfaces();
        child1.toString();

        String a = new String();
    }
}
