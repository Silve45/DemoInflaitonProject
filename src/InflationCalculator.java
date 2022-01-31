import java.util.InputMismatchException;
import java.util.Scanner;

public class InflationCalculator {
    double number;

    public double getNumber() {
        return number;
    }

    public void Inflation(Scanner sc){

        double checknumber, newnumber, rate;

        while (true) {
            try {

                System.out.println("Print base number");

                number = sc.nextDouble();
                System.out.println("Print Inflation Rate (print it in percent form, program will translate into decimal form)");
                rate = sc.nextDouble();
                rate = rate * .01;

                System.out.println("How many years");
                int year = sc.nextInt();

                System.out.println("Calculating Inflation of number " + number + " with inflation rate of " + rate + " and " + year + " year(s)");

                checknumber = number * rate * year;
                newnumber = number - checknumber;

                System.out.println("The number " + number + " will be worth " + newnumber + " in " + year + " years!");

            } catch (InputMismatchException e) {
                System.out.println("Use a number Bozo... Restart");
                sc.nextLine();

            }
        }


    }

    public void InvestmentReturn(){

    }

    public void TaxRate(){

    }

    public void AddAll(){


    }
}
