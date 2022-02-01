import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InflationCalculator IC = new InflationCalculator();
        Scanner sc = new Scanner(System.in);
        double Cn = 0;
        String y= "y";
        String n = "n";

        while (true){
        IC.MoneyCalc(sc);
            System.out.println("Would you like to do it again?");

            boolean check2;
            while (true){
                String check = sc.next();
                if (check.equalsIgnoreCase(y)){
                    System.out.println("Redoing loop");
                    check2 = true;
                    break;
                }
                else if (check.equalsIgnoreCase(n)){
                    System.out.println("Alright exiting loop");
                    check2 = false;
                    break;
                }
                else {
                    System.out.println("What was that?");
                    continue;
                }
            }
            if (check2 == true){
                continue;
            }
            else {
                break;
            }
        }



//        System.out.println("now Investment return");
//        IC.InvestmentReturn(sc);

//        System.out.println("Trying to add all");
        IC.AddAll();

    }
}
