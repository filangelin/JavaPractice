package practice7.generics;

public class Task3 {
    public static void main(String[] args) {
        Pair<Integer, String> intPair = new Pair();
        intPair.setKey(1);
        intPair.setValue("Один");
        System.out.println("Ключ Pair = " + intPair.getKey() + " значение = " + intPair.getValue());
    }
}
