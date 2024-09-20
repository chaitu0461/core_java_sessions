package day.six.overloading;

public class OverLoading {
    public void overLoadedMethod(){

    }

    // same method name different input arguments
    public void overLoadedMethod(String s1){

    }
    // same method name different input data types
    public  void overLoadedMethod(int a){

    }

    // same method name different number of arguments
    public  void overLoadedMethod(int a,int b){

    }



    //It has different return type but method name and argument types are same. so not considered as overloading
   /* public String overLoadedMethod(int a){
        return null;
    }*/
}
