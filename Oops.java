// Multilevel inheritance
class Bakery{
    String cake;
    String flavour;
    float tier;
    void display(){
        System.out.println("cake is :" + cake );
        System.out.println("flavour is :" + flavour );
        System.out.println("tier is :" +  tier);
    }
}
class Shop1 extends Bakery{
    double weight;
    float price;
    void show(){
        System.out.println("weight is:"+ weight);
        System.out.println("price is:"+ price);
    }

}
class Shop2 extends Shop1{
    void show1(){
       System.out.println("its yummy.......");

    }
    


}

public class Oops{
    public static void main(String[] args) {
        Shop1 s1=new Shop1();
        s1.cake="Black forest";
        s1.flavour="chocolate";
        s1.price=450;
        s1.tier=3;
        s1.weight=2.5;
        s1.display();
        s1.show();
        Shop2 s2 = new Shop2();
        s2.cake="unicon";
        s2.flavour="pineapple";
        s2.price=800;
        s2.tier=1;
        s2.weight=3;
        s2.display();
        s2.show();
        s2.show1();



       
    }

}