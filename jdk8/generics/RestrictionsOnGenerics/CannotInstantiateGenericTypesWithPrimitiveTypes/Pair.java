package generics.RestrictionsOnGenerics.CannotInstantiateGenericTypesWithPrimitiveTypes;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    /* */

    public static void main(String[] args) {
        Pair<int, char> p = new Pair<>(8, 'a'); //ERROR --> not accept primitive type
        Pair<Integer, Character> pPlus = new Pair<>(8, 'a');
        Pair<Integer, Character> pSuperPlus = new Pair<>(Integer.valueOf(8), new Character('a'));
    }
}
