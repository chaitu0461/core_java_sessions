package day.one;

public class JavaIntro {
    int height=10;// without static keyword all are object properties
     static int weight=100;
    //static variables
    static String surname="some";
    public static void main(String[] args) {
        System.out.println(weight);
        JavaIntro object=new JavaIntro(); //objrct created
        System.out.println(object.height);
        System.out.println(JavaIntro.surname);
        object.instanceMethod();
        JavaIntro.dummy();
        JavaIntro.withargs(10);





    }
    //these are static methods
    static  void dummy(){
        System.out.println("dummy called!!");
    }
   public static  void withargs(int a){
        System.out.println(" withargs called!! "+a);
    }
    public void instanceMethod(){
        System.out.println("accessing static variable in instance method::"+weight);
    }
}
