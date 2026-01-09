#need to update day2 with map as well. day1 me bhi need to add some java datatype basics.

### #Variables

Every object created will have diff values for these 2 variables.
#INSTANCE Variable : Declared OUTSIDE the METHOD.
#LOCAL Variable : Declared INSIDE the METHOD.

## #Static Variable
The values of static variables are same/shared in all objects. So, we can call these using by class name itself, without creating an object.

```
class Mobile{
    String brand;           //Instance Vars
    int price;  
    
    _Static_ String name;       //static
    
    public void show(){
        system.out.println(brand +":"+ name);
    }
}

public class Main{
    public static void main(String args{}){
        Mobile obj1 = new Mobile();
        Mobile obj2 = new Mobile();
        obj1.name = "Samsung";
        obj2.name = "iPhone";
        system.out.println(obj1.name);          //will print "iPhone"
        system.out.println(obj2.name);          //will print "iPhone" as well because name is a static var
                                                // and the last changed value was "iPhone"
        //Calling by class name is preferred:
        system.out.println(Mobile.name);                          
                      
    }
}
```

## #Static Method
Just like static variables, we can call static methods directly by Classname:

```
class Mobile{
    String brand;           //Instance Vars
    int price;  
    
    _Static_ String name;       //static-Variable
    
    
    //We cannot use non-static varibales like 'brand','price' insdie static method, for that we'll pass object refrence:
    public static void show(Mobile obj){                  //static-Method
        system.out.println(obj.brand + ":" + obj.price + ":"+ name);
    }
}

public class Main{
    public static void main(String args{}){
        Mobile obj1 = new Mobile();
        obj1.show(obj1);                        
                      
    }
}
```
