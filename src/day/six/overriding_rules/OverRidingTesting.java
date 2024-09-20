package day.six.overriding_rules;

public class OverRidingTesting {
    private int number=10;
    public static void main(String[] args) {
        Father father= new Father("raj","dk");
        Father father2=new Father("raj","dk");
        Father son=new Son();
        father.goToMarket();
        son.goToMarket();
        OverRidingTesting overRidingTesting= new OverRidingTesting();
        overRidingTesting.accessNumberUsingThisKeyword(overRidingTesting);
        System.out.println("father hash code:"+father.hashCode());// to string will be called. Object@hashcode
        System.out.println("father2 hash code:"+father2.hashCode());
        // for custom object , default implementation of equals method compares hash code
      //  System.out.println("father and father 1 variables are equal::"+father.equals(father2));

        Father fatherWithNameAndSurname= new Father("raj","dk");
        // we did not use this keyword for surname. hence null
        System.out.println("father name::"+fatherWithNameAndSurname.name +" father surname::"+fatherWithNameAndSurname.surname);

        Father nullFather=null;
        // System.out.println(nullFather.surname); // if you perfrom any operration on null, it gives null pointer exception
        System.out.println(nullFather);



    }

    public void accessNumberUsingThisKeyword(OverRidingTesting overRidingTesting){
        System.out.println("accessing instance variable using object variable "+overRidingTesting.number);
        System.out.println("accessing instance variable using this keyword"+this.number);
        System.out.println(number);
    }
    public static void staticMethod(OverRidingTesting overRidingTesting){
       // this.number;// cannot use this keyword in static methods
    }

}
