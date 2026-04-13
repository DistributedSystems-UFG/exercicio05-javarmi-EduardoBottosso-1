package example.hello;

import java.rmi.Naming;

public class Client {

    private Client() {}

    public static void main(String[] args) {

        System.out.println("Initiating client");

        String host = (args.length < 1) ? "localhost" : args[0];

        try {
            Hello stub = (Hello) Naming.lookup("rmi://" + host + "/MyHello");
            System.out.println("Found Hello server");

            String response = stub.sayHello();
            System.out.println("Response: " + response);

            int result = stub.soma(100, 1000);
            System.out.println("Response from soma: " + result);

            int multi = stub.multiplicacao(100, 1000);
            System.out.println("Response from multiplicacao: " + multi);

            int quad = stub.quadrado(100);
            System.out.println("Response from quadrado: " + quad);

            Calculator calc = (Calculator) Naming.lookup("rmi://" + host + "/MyCalculator");
            System.out.println("Found Calculator server");

            int calcMulti = calc.multiplicacao(10, 5);
            System.out.println("Calc multiplicacao: " + calcMulti);

            int calcDiv = calc.divisao(20, 4);
            System.out.println("Calc divisao: " + calcDiv);

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
