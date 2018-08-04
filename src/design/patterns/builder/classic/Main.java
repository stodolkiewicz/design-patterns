package design.patterns.builder.classic;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount.Builder(16235632)
                .setBalance(40000000.00)
                .setOwner("owner")
                .setInteresRate(5.2)
                .build();

        System.out.println(bankAccount);
    }
}
