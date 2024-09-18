package day.four;

public class DayFour {
    int instanceVariable;
   static int staticVariable=20;

    public static void main(String[] args) {
        DayFour dayFour=new DayFour();
       // dayFour.instanceMethod(dayFour);
       dayFour.operators();


    }

    private void operators() {
        int a=-10; // single minus operator
        int b=10;
        System.out.println(++b); //11 pre increment
        System.out.println(b++);// 11 post increment
        System.out.println(b);//12

        // assignment operators
        int c=8;
        c+=3; // equal to c=c+3
        System.out.println(c);


        // relational operators

        int ab=10;
        int bc=10;
        System.out.println(ab==bc);

        //logical operators

        int one=1;
        int two=2;
        System.out.println(1&2); // bit wise and applicable to numbers
        System.out.println(false & true); // bit wise and applicable to boolean

        System.out.println(false && true); // && || only applicable to booleans

        int x=10;
        int y=12;
       if(++x<10 & ++y>12){
           x++;
       }
       else
           y++;

        System.out.println("short circuit operator result::"+ x+"::"+y);
        System.out.println("short circuit operator result::"+ x+"::"+y);
        System.out.println("concatenation and operator result::"+ x+y); // if there is string , before + operator, concatination
        boolean condition=false;
        condition=!condition;
        System.out.println(condition); //! opertor only applicable on booleans
        boolean result=2>3?true:false;
        System.out.println(result);




    }

    public void instanceMethod(DayFour dayFour){
        int localVaribale=2;
        //instance and staic variables have default values
        System.out.println(dayFour.instanceVariable);
        System.out.println(localVaribale);
    }
    public void anotherInstanceMethod(DayFour dayFour){
        System.out.println(dayFour.instanceVariable);
        // cannot access local variable of another method
       // System.out.println(localVaribale);
    }

}
