package example.hello;

import java.rmi.Naming;

public class CalculatorServer {

    public static void main(String[] args) {
        try {
            CalculatorImplem obj = new CalculatorImplem(5679);

            Naming.rebind("MyCalculator", obj);

            System.out.println("Calculator Server ready");

        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
