package app;

import java.util.Scanner;
import java.util.Locale;

public class Main01 {
    static final String CURRENCY = "USD";
    static double amount;
    static double discount;
    static double toPay;

    public static void main(String[] args) {

        enterSum();
        calcDiscount();
        calcPay();
        showData();
    }

    private static void enterSum() {
        //Вводимо загальну сумму закупівель
        //Отримуємо розрахунок
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Enter purchase amount : ");
        amount = scanner.nextDouble();


    }

    private static void showData() {

        System.out.printf("Total amount , %s : %.2f \nDiscount amount , %s : %.2f \nTotal to pay , %s : %.2f",
                CURRENCY, amount, CURRENCY, discount, CURRENCY, toPay);


    }

    private static void calcDiscount() {
        int limit1 = 5000;
        int limit2 = 10000;
        int limit3 = 10001;

        if (amount <= limit1) {
            discount = (amount / 100) * 5;

        } else if (amount > limit1 & amount <= limit2) {
            discount = (amount / 100) * 10;

        } else if (amount >= limit3) {
            discount = (amount / 100) * 15;
        }


    }
    private static void calcPay() {
        toPay = amount - discount;

    }
}

