package day.five.inhertence;

public class Child extends Parent{
    int childVariable=30;
    public static void main(String[] args) {
        Child child=new Child();
        child.parentMethod();
        System.out.println(child.childVariable);
       // System.out.println(child.privateParentVariable); // cannot access private fields of parent class
        System.out.println(child.publicParentVariable);


        //Parent data type(left side) can hold child object ONLY inheritence
        Parent child_two=new Child();
       // child_two.childMethod(); // can only access parent methods bcz data type is parent


    }
    public void childMethod(){
        System.out.println("child Method");
    }



}
