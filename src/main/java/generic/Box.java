package generic;

public class Box<T> {

    //Generics in Java allow you to create classes, interfaces, and methods that operate on different data types while providing type safety. Here's a simple generic class example:
    private T content;

    public Box() {

    }
    public void add(T item) {
        content = item;
    }
    public T get() {
        return content;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        Box<String> stringBox = new Box<>();
        integerBox.add(34);
        stringBox.add("Hello, Generics!");
        System.out.println("integerBox = " + integerBox.get());
        System.out.println("stringBox = " + stringBox.get());
        //integerBox = 34
        //stringBox = Hello, Generics!
    }
}
