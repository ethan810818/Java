package generics.RestrictionsOnGenerics.CannotDeclareStaticFieldsWhoseTypesAreTypeParameters;

public class MobileDevice<T> {
    private static T os;

    private static void main(String[] args) {
        MobileDevice<SmartPhone> phone = new MobileDevice<>();
        MobileDevice<Pager> pager = new MobileDevice<>();
        MobileDevice<TabletPC> pc = new MobileDevice<>();
    }
}
