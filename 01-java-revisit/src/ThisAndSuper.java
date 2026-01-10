//class A{
//    public A(){
//        System.out.println("in A");
//    }
//}
//
//class B extends A{
//    public B(){
//        System.out.println("in B");
//    }
//    public B(int n){                //NOT CALLED, as only default constructor was triggered
//        System.out.println("in B int");
//    }
//}
//
//public class ThisAndSuper{
//    public static void main(String[] args) {
//        B obj = new B();    //Will call constructor of SUB-class & SUPER-class both
//        //We have only created object for B, means contractor of B should be called
//        //But here contractor of A will also get called.
//
//    }
//}

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
public class ThisAndSuper{
    public static void main(String[] args) {
        B obj = new B(5);                   //Step 1

    }
}
