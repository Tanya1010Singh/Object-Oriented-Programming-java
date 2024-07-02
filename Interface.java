
/*interface Car{
    void display();
}
class Bmw implements Car{
   public void display(){
        System.out.println("expensive");
    }
}
class Volvo implements Car{
   public void display(){
        System.out.println("cheap");
    }
}
public class Interface{
    public static void main(String[] args) {
        Car c1=new Volvo();
        c1.display();
    }
}*/

interface A{
public void show();
}
interface B{
    public void show();
}
class C implements A,B{
    public void show(){
        System.out.println("hi! how are you?");
    }
}
public class Interface{
    public static void main(String[] args) {
        C c1=new C();
        c1.show();
    }
}