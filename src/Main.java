import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InflationCalculator IC = new InflationCalculator();
        Scanner sc = new Scanner(System.in);
        double Cn = 0;

        IC.Inflation(sc);
        Cn = IC.getNumber();
        System.out.println("and Cn = " + Cn);

    }
}
