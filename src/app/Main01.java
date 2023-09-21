package app;


import java.util.Scanner;
import java.util.Locale;

public class Main01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Enter purchase amount : ");
        double amount = scanner.nextDouble();
        scanner.close();

        CalcService service = new CalcService();
        Outputer output = new Outputer();

        double discount = service.calcDiscount(amount);
        double purchase = service.calcTotal(amount, discount);
        output.getOutput(discount);
        output.getOutputTotal(purchase);







    }
}

