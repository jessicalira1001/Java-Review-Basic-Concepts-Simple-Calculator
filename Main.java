/**
 * In this project I will use the basic concepts of programming for to implement a calculator
 *
 **/

public class Main {


    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.sum(1,2));
        System.out.println(c.subtract(1,2));
        System.out.println(c.multiply(1,2));
        System.out.println(c.divide(3,0));


    }
}
