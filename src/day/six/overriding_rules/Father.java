package day.six.overriding_rules;

import java.util.Objects;

public class  Father{
    String name;
    String surname;
    protected Father goToMarket(){
        System.out.println("Father is going to market");
        Father father=new Father();
        return father;
    }


    public String toString() {
        return "This is father class";
    }

    @Override
    public boolean equals(Object o) {
        Father father = (Father) o;
        return this.name.equals(father.name) && this.surname.equals(father.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
    // we can have method with same name as constructor. But bad practice
    public void Father(){

    }

    public Father(String name,String surname){
       this. name=name;
       surname=surname;
    }
    public Father(){

    }
}
