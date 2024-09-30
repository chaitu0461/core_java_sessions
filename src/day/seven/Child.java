package day.seven;

public class Child extends Parent{

    static {
        System.out.println("Child class static block");
    }

     {
        System.out.println("Child class instance block");
    }

    Child(){
        //super(); constructor places this line by default. We no need to write explicitly
        System.out.println("Child constructor called");
    }
    // if the parent class has constructor with some arguments , we need to call that constructor manually
   /* Child(int parentVariable) {
        super(parentVariable);
    }*/

    @Override
    //over rididng
    protected void myMethod(){
        System.out.println("This is child method!");
    }
//if parent and child classes have same static methods, it is called method hiding
    public static void myStaticMethod(){
        System.out.println("child class static method called");
    }
    public static void main(String[] args) {
        Parent child=new Child();
        child.myMethod();// for over ridden methods , the method call depends on Object being created(right side)
        child.myStaticMethod(); //  here parent class static method will be called since static method calling
        // depends on Variable type (left hand side)
        Parent parent=new Parent();
        parent.myMethod();  //  here parent class my method  will be called
        // please check for constructor chaining and order in which static and instance blocks will be called


    }
    public void accessParentVariale(){
        //super(); we can use parent constructor only in constructors. not in methods
        System.out.println(super.common); // to access parent class instance variable methods, we can use super
    }
}
