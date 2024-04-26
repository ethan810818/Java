package InterfaceAndInheritance.inheritances.OverridingAndHidingMethod;

public class FlyingCar implements OperateCar, FlyCar {
    
    public int startEngine(EncryptedKey key) {
        FlyCar.super.startEngine(key);
        OperateCar.super.startEngine(key);
    }
}
