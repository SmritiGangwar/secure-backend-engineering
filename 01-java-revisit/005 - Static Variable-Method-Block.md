
### Variables

Every object created will have diff values for variables.<br>
#INSTANCE Variable : Declared OUTSIDE the METHOD.<br>
#LOCAL Variable : Declared INSIDE the METHOD.<br>

## Static Variable
The values of static variables are same/shared in all objects. So, we can call these using by class name itself, without creating an object.

```java
class Mobile{
    String brand;           //Instance Vars
    int price;  
    
    static String name;       //static
    
    public void show(){
        System.out.println(brand +":"+ name);
    }
}

public class Main{
    public static void main(String args[]){
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        obj1.name = "Samsung";
        obj2.name = "iPhone";
        System.out.println(obj1.name);          //will print "iPhone"
        System.out.println(obj2.name);          //will print "iPhone" as well because name is a static var
                                                // and the last changed value was "iPhone"
        //Calling by class name is preferred:
        System.out.println(Mobile.name);                          
                      
    }
}
```

## Static Method
Just like static variables, we can call static methods directly by Classname:

```java
class Mobile{
    String brand;           //Instance Vars
    int price;  
    
    static String name;       //static-Variable
    
    
    //We cannot use non-static variables like 'brand','price' inside static method, for that we'll pass object reference:
    
    public static void show1(Mobile obj){                  //static-Method
        System.out.println(obj.brand + ":" + obj.price + ":"+ name);
    }
}

public class Main{
    public static void main(String [] args){
        Mobile obj1 = new Mobile();
        Mobile.show1(obj1);                        
                      
    }
}
```

### 'STATIC' in Main-Method definition
If we do not use 'static' keyword for psvm Main-Method, it will need to have reference/object of the class to be Called for execution.<br>
But, As we know main() is the starting point of code execution, so how can we create its class reference prior to that?<br>
It will cause a Deadlock situation.


## Static Block - called only once
> When we create any class Object, it always calls the default constructor of it. But, if the value of static variable is already initialized once inside that constructor,
> it will be unnecessary everytime an object will create. It will again initialize the variable as constructor will be called.
> All the objects will have same variable values for static variables.

```java
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
    public static void main(String [] args) {
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

```

### What happens when an Object is Created?
1. Class Loads
2. Objects are instantiated

Class loads only once. In JVM there is special area - "Class Loader", it has all the loaded class.  
Static block gets called when class is called i.e. only once.

Class can nvr be loaded without creating an object, if we want to do so,   
there is one method - `Class.forName("<className>");` It throws 'classNotFoundException'
