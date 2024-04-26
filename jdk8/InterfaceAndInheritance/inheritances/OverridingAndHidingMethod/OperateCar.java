package InterfaceAndInheritance.inheritances.OverridingAndHidingMethod;


public interface OperateCar {
    default public int startEngine(EncryptedKey key) {
        System.out.println("Starting the OperateCar engine...");
    }
}
