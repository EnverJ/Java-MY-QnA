package generic;

public class MyGenericClass {
    private  Integer myVar;
    public void setMyVar(Integer i) {
        myVar = i;
    }
    void printValue(){
        System.out.println("The value of myVar is : " + myVar);
    }
}
