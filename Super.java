//Super keyword to invoke parent class method.

/*class Animal{
    void eat(){
        System.out.println("am eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("wow..");
      
    }
    void eat(){
        System.out.println("chill..");
    }
    void work(){
        bark();
        super.eat();
    }
}
public class Super{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.work();
    }
}*/

//Super keyword to invoke parent class variable.

/*class Cartoon{
    String name="ben";
}
class Ben10 extends Cartoon{
    String name="koko";
    public void show(){
        System.out.println(name);
        System.out.println(super.name);

    }

}
public class Super{
    public static void main(String[] args) {
        Ben10 b1= new Ben10();
        b1.show();
    }
}*/

//Super keyword to invoke parent class constructor.

class Animal{
    Animal(){
        System.out.println("tiger");
    }
    void box(){
        System.out.println("good");
    }

}
class Lion extends Animal{
    Lion(){
        System.out.println("fox");
        super();
        super.box();
    }
}
public class Super{
    public static void main(String[] args) {
        System.out.println("jungle...");
        Lion l1=new Lion();
        
    }
}








