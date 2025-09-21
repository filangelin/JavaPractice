package practice7.generics;

public class Task1 {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setValue(5);
        System.out.println(intBox.getValue());

        Box<String> strBox = new Box<>();
        strBox.setValue("string");
        System.out.println(strBox.getValue());
    }
}
