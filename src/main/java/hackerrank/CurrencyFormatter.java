package main.java.hackerrank;

import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatter {
    public static void main(String[] args) {
        double payment = 12324.134;

        NumberFormat nfEn = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat nfIn = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat nfCh = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat nfFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + nfEn.format(payment));
        System.out.println("India: " + nfIn.format(payment));
        System.out.println("China: " + nfCh.format(payment));
        System.out.println("France: " + nfFr.format(payment));
    }
}
