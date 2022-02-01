import java.util.InputMismatchException;
import java.util.Scanner;

public class InflationCalculator {
    double number, newnumber, newinumber;
    double checknumber, checkinumber;



    public double getNumber() {
        return number;
    }

    public void Inflation(Scanner sc){

        double  rate;

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
                break;

            } catch (InputMismatchException e) {
                System.out.println("Use a number Bozo... Restart");
                sc.nextLine();

            }
        }

    }

    public void InvestmentReturn(Scanner sc){

        double newnumber, rate;

        while (true) {
            try {

                System.out.println("Print base number");

                number = sc.nextDouble();
                System.out.println("Print Investment Rate (print it in percent form, program will translate into decimal form)");
                rate = sc.nextDouble();
                rate = rate * .01;

                System.out.println("How many years");
                int year = sc.nextInt();

                System.out.println("Calculating Investment of number " + number + " with Investment rate of " + rate + " and " + year + " year(s)");

                checkinumber = number * rate * year;
                newinumber = number + checkinumber;

                System.out.println("The number " + number + " will be worth " + newinumber + " in " + year + " years!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Use a number Bozo... Restart");
                sc.nextLine();

            }
        }
    }

    public void TaxRate(){

    }

    public void AddAll(){
        System.out.println("So in all this is extra money you will make/lose " + (checkinumber - checknumber));


    }
}
