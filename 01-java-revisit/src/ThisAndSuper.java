class A{
    public A(){
        System.out.println("in A");
    }
}

class B extends A{
    public B(){
        System.out.println("in B");
    }
    public B(int n){                //NOT CALLED, as only default constructor was triggered
        System.out.println("in B int");
    }
}

public class ThisAndSuper{
    public static void main(String[] args) {
        B obj = new B();    //Will call constructor of SUB-class & SUPER-class both
        //We have only created object for B, means contractor of B should be called
        //But here contractor of A will also get called.

    }
}
