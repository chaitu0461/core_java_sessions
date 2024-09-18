package day.five;

public class DayFive {
    public static void main(String[] args) {
       // instanceMethod(); // cannot call instance method from static methods
        staticMethod();
        int operation= addNumbers(1,2);
    }

    private static int addNumbers(int i, int i1) {
        int result=i+i1;
        return result;
       // int a=20; should not write any statement after return
    }

    private void instanceMethod(){

    }
    private static void staticMethod(){

    }
    private float addFloats(){
       return 1.0f;
    }
}
