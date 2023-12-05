package generic;

public class GenericsDemo {
    public static void main(String[] args) {
        MyGenericClass myGenericClass = new MyGenericClass();
        myGenericClass.setMyVar(89);
        myGenericClass.setMyVar(56);
        myGenericClass.printValue();
    }
}
