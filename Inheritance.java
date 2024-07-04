class A{
    public void print(){
        System.out.println("class A is printed");

    }

}
class B extends A{
    public void show(){
        System.out.println("Hello B is printed");
    }
}
class C extends A{
    public void display(){
        System.out.println("hello C is printed");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("hi");
        B obj1=new B();
        C obj2=new C();
        obj1.print();
        obj2.print();
    }
    
}

//method overloading..

/*import java .util.*;
import java.lang.*;
import java.io.*;
public class Inheritance{
     public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static String sum(String a,String b){
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,1));
        System.out.println(sum("red","green"));
    }
}*/

//method overriding
/*import java.util.*;
import java.lang.*;
import java.io.*;
class Bank{
    public void rateofintrest(){
        System.out.println("bank rate of intrest :5%");
    }
}
class Sbi extends Bank{
    public void rateofintrest(){
        System.out.println("sbi rate of intrest:5.5%");
    }
}
class Pnb extends Bank{
    public void rateofintrest(){
        System.out.println("pnb rate of intrest:6%");
    }
}
public class Inheritance{
    public static void main(String[] args) {
        Sbi s1=new Sbi();
        Pnb p1=new Pnb();
        s1.rateofintrest();
        p1.rateofintrest();
    }
}*/


