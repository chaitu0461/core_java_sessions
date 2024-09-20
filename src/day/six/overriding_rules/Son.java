package day.six.overriding_rules;

public class Son extends Father{
    // since son is sub class(child class) of father, we can return son variable
    @Override
    public Father goToMarket(){
        System.out.println("Son is going to market");
        Son son= new Son();
       // return new Object(); // cannot return parent type. Object is a parent to father
        return son;
    }
}
