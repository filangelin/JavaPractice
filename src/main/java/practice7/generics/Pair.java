package practice7.generics;

public class Pair<K, V> {
    private K key;
    private V value;

    void setKey(K key) {
        this.key = key;
    }

    K getKey() {
        return key;
    }

    void setValue(V value) {
        this.value = value;
    }

    V getValue() {
        return value;
    }
}
