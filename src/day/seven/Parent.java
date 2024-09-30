package day.seven;

public class Parent {
    String common="parent class related";

    int parentVariable;
    static {
        System.out.println("Parent class static block");
    }
    {

        System.out.println("Parent class instance block");

    }
    protected void myMethod(){
        System.out.println("This is parent class methood");
    }
    public static void myStaticMethod(){
        System.out.println("parent class static method called");
    }
     Parent(){
        System.out.println("Parent constructor caleld");
    }
   /* Parent(int parentVariable){
        this.parentVariable=parentVariable;
    }*/

}
