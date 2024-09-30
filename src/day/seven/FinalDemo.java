package day.seven;
// if we use final for class, it cannot be a parent class
public   class FinalDemo {
    private static final int staticFinalVariable=10; // static final variables have to be assigned there only
    private  final int instanceFinalVariable; //instance final variables can be initialized in constructor

    FinalDemo(){
        instanceFinalVariable=20;
    }
    // final methods cannot be over ridden
    public final void myFinalMethod(){}
    public static void main(String[] args) {


    }
}
