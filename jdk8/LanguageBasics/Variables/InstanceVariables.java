package LanguageBasics.Variables;

public class InstanceVariables {
    private int number;//Field
    private static int staticNumber = 2; //Static Field

    public void doSomeThing() {

        int zero = 0;// Local variable

        number = 22; // Instance variable (field)

        staticNumber += staticNumber;
    }
}
