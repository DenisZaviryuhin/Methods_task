package app;

public class Outputer {
    static final String CURRENCY = "USD";

    public void getOutput(double output) {
        System.out.printf("Your discount is %s %.2f", CURRENCY, output);

    }

    public void getOutputTotal(double outputTotal) {
        System.out.printf("\nTotal purchase amount is %s %.2f", CURRENCY, outputTotal);
    }
}
