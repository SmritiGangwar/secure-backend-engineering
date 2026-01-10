class Mobile{
    String brand;           //Instance Vars
    int price;

    static String name;        //static-Variable

    static{                    //will be called only once
        name = "Phone";
        System.out.println("in static block");
    }

    public Mobile(){           //CONSTRUCTOR-no return type
        brand = "";
        price = 10;
        System.out.println("in constructor");
    }
    public void show(){
        System.out.println(brand + " : " + price + ":"+ name);
    }
}
public class StaticBlock {
    public static void main(String args[]) {
        System.out.println("----1----");
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        Mobile.name = "SmartPhone";     //If we remove this, "Phone" will be set for both objects
        obj1.show();

        System.out.println("----2----");
        Mobile obj2 = new Mobile();
        obj2.show();

    }
}