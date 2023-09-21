package app;

public class CalcService {

    double calcDiscount(double amount) {

        double discount;
        if (amount <= 5000) {
            discount = amount * 5 / 100;
        } else if (amount > 5000 & amount <= 1000) {
            discount = amount * 10 / 100;

        } else {
            discount = amount * 15 / 100;

        }
        return discount;
    }

    double calcTotal(double amount, double discount) {
        return amount - discount;


    }

}


