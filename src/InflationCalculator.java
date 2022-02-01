import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InflationCalculator {
    double number, newnumber;
    double checknumber;
    String y = "y";
    String n = "n";

    ArrayList<Double> investmentNum = new ArrayList<>();
    ArrayList<Double> inflationNum = new ArrayList<>();


    public void MoneyCalc(Scanner sc){

        double  rate;

        while (true) {
            try {

                System.out.println("Print base number");


                number = sc.nextDouble();
                System.out.println("Print percent Rate (print it in percent form, program will translate into decimal form)");
                rate = sc.nextDouble();
                rate = rate * .01;

                System.out.println("How many years");
                int year = sc.nextInt();

                System.out.println("Calculating inflation/investment of number " + number + " with percent rate of " + rate + " and " + year + " year(s)");

                checknumber = number * rate * year;

                System.out.println("Is this for investment or inflation? (IV) or (IF)");
                String check = sc.next();
                while (true){
                    if (check.equalsIgnoreCase("iv")){
                        System.out.println("Alright using investment calculator");
                        newnumber = number + checknumber;
                        investmentNum.add(newnumber);
                        break;
                    }
                    else if (check.equalsIgnoreCase("if")){
                        System.out.println("Alright using inflation calculator ");
                        newnumber = number - checknumber;
                        Double newAddNumber = number + checknumber;
                        inflationNum.add(newAddNumber);

                        break;
                    }
                    else {
                        System.out.println("Please use (IV) or (IF). Do not use parentheses");
                    }
                }



                System.out.println("The number " + number + " will be worth " + newnumber + " in " + year + " years!");
                break;

            } catch (InputMismatchException e) {
                System.out.println("Use a number Bozo... Restart");
                sc.nextLine();

            }
        }

    }




    public void AddAll(){
        double finalInflation = 0, finalInvestment= 0;
        for (int i = 0; i < inflationNum.size(); i++){
            finalInflation = finalInflation + inflationNum.get(i);
        }

        for (int i = 0; i < investmentNum.size(); i++){
            finalInvestment = finalInvestment + investmentNum.get(i);
        }

        finalInflation *= -1;
        System.out.println("The Inflation is " + finalInflation);

        System.out.println("The Investment is " + finalInvestment);

        System.out.println("\nThis program is based off of the assumption that you are using the same number and the same years every time. " +
                "\nFor the final version, implement a way to accurately show the information regardless of number or year");
        System.out.println("So in all this is extra money you will make/lose " + (finalInvestment + finalInflation));


    }

    public void TaxRate(){

    }
}// end class InflationCalculator

