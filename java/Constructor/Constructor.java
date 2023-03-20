package Constructor;

public class Constructor {
    int  i; //class attributes
    Constructor(){
        i = 5;
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        System.out.println(obj1.i);
    }
}
