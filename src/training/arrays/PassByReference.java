package training.arrays;

public class PassByReference {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("        PASSING ARRAYS TO METHODS             ");
        System.out.println("==============================================");

        double[] accountBalances = {5000.0, 10000.0, 15000.0};

        System.out.println("\nBalances before the service fee:");
        for (double balances : accountBalances){
            System.out.println("PHP " + balances);
        }

        applyServiceFee(accountBalances);

        System.out.println("\nBalances after the service fee:");

        for (double balances : accountBalances){
            System.out.println("PHP " + balances);
        }
    }

    static void applyServiceFee(double[] balances){
        for(int index = 0; index < balances.length; index++){
            balances[index] -= 10.0;
        }
    }
}
