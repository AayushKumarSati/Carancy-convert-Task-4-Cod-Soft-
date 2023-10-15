import java.util.Scanner;

public class carancy_Converter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double usdToEur = 0.85;
        double usdToGbp = 0.73;
        System.out.println("This Is A Currency Converter");
        System.out.print("Enter The Ammount Of United State : ");
        double amountInUsd = scn.nextDouble();
        System.out.println("<----Select To The Currency To Convert You ---->");
        System.out.println("1. Euro (EUR)");
        System.out.println("2. British Pound (GBP)");
        double converted_Amount = 0.0;
        String target_Currency = "";
        int choices = scn.nextInt();

        if (choices == 1) {
            converted_Amount = amountInUsd * usdToEur;
            target_Currency = "Euro(EUR)";

        } else if (choices == 2) {
            converted_Amount = amountInUsd * usdToGbp;
            target_Currency = "British Pound (GBP)";

        } else {
            System.out.println("Your Choice Is invalid !");
            System.exit(1);
        }
        System.out.println("Converted Ammount Is : " + converted_Amount + " " + target_Currency);

    }
}