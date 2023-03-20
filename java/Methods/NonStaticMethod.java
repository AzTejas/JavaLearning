package Methods;

public class NonStaticMethod {
    void myMethod(){
        System.out.println("My first normal method");
    }


    public static void main(String[] args) {
        NonStaticMethod nonStaticMethod = new NonStaticMethod(); //constructor
        nonStaticMethod.myMethod();
    }
}
//find out a way to create a static and nonstatic variable and call it in the main method.