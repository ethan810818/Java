package InterfaceAndInheritance;

public interface DoIt {
    void doSomethingO(int i, double x);
    int doSomethingElse(String s);
    default boolean didItWork(int i, double x, String s) {
        return false;
    };
}
