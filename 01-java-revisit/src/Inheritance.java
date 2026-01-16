public class Inheritance {
    public static void main(String[] args) {
//        Calculator obj  =  new Calculator();
//        System.out.println("Addition : " + obj.add(5,3));
//        System.out.println("Subtraction : " + obj.sub(5,3));

        //Using AdvClass which inherits Calculator class :

        AdvCalculator obj  =  new AdvCalculator();
        System.out.println("Addition : " + obj.add(5,3));
        System.out.println("Subtraction : " + obj.sub(5,3));
        System.out.println("Multiplication : " + obj.multiply(5,3) );
        System.out.println("Division : " + obj.divide(5,3) );
    }
}
