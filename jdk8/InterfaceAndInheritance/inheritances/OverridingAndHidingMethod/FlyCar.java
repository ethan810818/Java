package InterfaceAndInheritance.inheritances.OverridingAndHidingMethod;

import javax.security.auth.kerberos.EncryptionKey;

public interface FlyCar {
    default public int startEngine(EncryptedKey key) {
        System.out.println("Starting  the FlyCar engine...");
    }
}
