package day.two.countries;


import day.two.enemies.Pakistan;

public class India {
    String countryName="india";
    public static void main(String[] args) {
        USA usa= new USA();
        System.out.println(usa.gdp); // can access protected variable in same package
        // usa.secret; cannot acces private variable in another class
        Pakistan pakistan=new Pakistan();
         System.out.println(pakistan.capital);
    }
}
