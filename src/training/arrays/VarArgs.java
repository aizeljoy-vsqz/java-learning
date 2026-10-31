package training.arrays;

public class VarArgs {

    static double totalDeposits(double... deposits){
        double total = 0;

        for(double deposit : deposits){
            total += deposit;
        }

        return total;
    }

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("                VARARGS DEMO                  ");
        System.out.println("==============================================");

        double firstTotal = totalDeposits(100.5, 200.75, 50.25);
        System.out.println("\nFirst Deposit Total: PHP " + firstTotal);


        double secondTotal = totalDeposits(500.0, 150.25, 300.75, 400.00, 250.50);
        System.out.println("\nSecond Deposit Total: PHP " + secondTotal);

        double emptyTotal = totalDeposits();
        System.out.println("\nEmpty Total: PHP " + emptyTotal);

        double[] scheduledDeposits = {1000.0, 2500.0, 3500.0};

        double scheduledTotal = totalDeposits(scheduledDeposits);
        System.out.println("\nScheduled Deposit Total: PHP " + scheduledTotal);
    }
}
