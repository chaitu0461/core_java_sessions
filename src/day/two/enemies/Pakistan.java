package day.two.enemies;

import day.two.countries.USA;

public class Pakistan {
  public String capital="Islamabad";

  public static void main(String[] args) {
    USA usa=new USA();
   // System.out.println(usa.gdp); cannot access protected variable in a different package
  }
}
