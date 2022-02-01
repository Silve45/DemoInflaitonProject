import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InflationCalculator IC = new InflationCalculator();
        Scanner sc = new Scanner(System.in);
        double Cn = 0;

        IC.Inflation(sc);

        System.out.println("now Investment return");
        IC.InvestmentReturn(sc);

        System.out.println("Trying to add all");
        IC.AddAll();

    }
}
