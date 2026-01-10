
## THIS and SUPER methods

>We have only created object for B, means constructor of B should be called<br>
>But here constructor of A will also get called as we are extending the class A in class B.


```java
class A{    //SUPER-class Or PARENT-class
    public A(){                     //CALLED
        System.out.println("in A");
    }
}

class B extends A{          //B : SUB-class or CHILD-class
    public B(){                     //CALLED
        System.out.println("in B");
    }
    public B(int n){                //NOT CALLED, as only default constructor was triggered
        System.out.println("in B int");
    }
}

public class ThisAndSuper{
    public static void main(String[] args) {
        B obj = new B();    //Will call constructor of SUB-class & SUPER-class both
        
    }
}
/*OP : in A
      in B
*/
```

>IF parameterized constructor of class B is called: 
```java
class A{    //SUPER-class
    public A(){                     //CALLED
        System.out.println("in A");
    }
}

class B extends A{          //B : SUB-class     
    public B(){                     //NOT CALLED
        System.out.println("in B");
    }
    public B(int n){                // CALLED
        System.out.println("in B int");
    }
}

public class Demo{
    public static void main(String[] args) {
        B obj = new B(5);    
        
    }
}
/*OP : in A
       in B int
*/
```
> What if both the classes, SUB-B and SUPER-A have parametrized constructor and only param. constructor of class B is called?

```java
class A{    //SUPER-class
    public A(){                     // CALLED
        System.out.println("in A");
    }
    public A(int n){                //NOT CALLED 
        System.out.println("in A int");
    }
}

class B extends A{          //B : SUB-class     
    public B(){                     
        System.out.println("in B");
    }
    public B(int n){                // CALLED
        System.out.println("in B int");
    }
}

public class Demo{
    public static void main(String[] args) {
        B obj = new B(5);    
        
    }
}
/*OP : in A
       in B int

Why Parametrized constructor of class A was not called? Because of the concept of super() method.*/

```
### #SUPER( )
In java, Every constructor has one hidden method mentioned '**super( )**'.
>super() Means : Call the constructor of SUPER Class. That's why default constructor of Class A is called first
> and it is printing "in A" at first line of output. Then it will run the remaining statements under the super( ) call;

```java
class A{
    public A(){                             //Step 3 : As no param mentioned in super() of subclass constructor,
        super();                                        //this default constructor was called
        System.out.println("in A");         //Step 4: prints "in A"            
        // class A does not have super-class so it will return back to Step 2, and remaining statements will execute.
    }
    public A(int n){
        super();
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        super();                                //Step 2 : it will call for constructor of A      
        System.out.println("in B int");         //Step 5 : prints "in B int". end.
    }
}
public class Demo{
    public static void main(String[] args) {
        B obj = new B(5);                   //Step 1  

    }
}
```

So, what if we want to call the parametrized constructor of SuperClass-A as well? 
>For that, we need parametrize the super() call, inside the constructor of SUBclass-B.
```java
class A{
    public A(){
        super();
        System.out.println("in A");

    }
    public A(int n){    //CALLED
        super();
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        super(10);                                //Step 2 : it will call for constructor of A(10);      
        System.out.println("in B int");
    }
}
public class Demo{
    public static void main(String[] args) {
        B obj = new B(5);                   //Step 1  

    }
}
```
```
OUTPUT : in A int
         in B int
Keep in mind that super() methods are already present inside the consturctors, 
we do not need to explicitly mention them, except for Parametrized Constructors of SuperClass.
```

### #THIS( )
NOW, What if we want to execute boht/all the constructors of one class? Here comes the concept of 'this()' method.
> this() Means : Call the constructor of current class.


```java
class A {
    public A() {                                //Step 6;
        super();
        System.out.println("in A");            //Step 7 : prints, go to Step 5

    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){                                //Step 4 : it was not called during obj creation, but by this()
        super();                               //Step 5 : call Const. of its SupperClass that is A
        System.out.println("in B");            //Step 8 : prints, go to Step 3
    }
    public B(int n){                           //Step 2
        this();                                //Step 3 : it will call for constructor of same class
        System.out.println("in B int");        //Step 9 : prints. end.
    }
}
public class Demo{
    public static void main(String[] args) {
        B obj = new B(5);                   //Step 1  

    }
}
```
```
OUTPUT : in A 
         in B
         in B int
```