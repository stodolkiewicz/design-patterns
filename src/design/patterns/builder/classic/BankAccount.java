package design.patterns.builder.classic;

public class BankAccount {
    private int accountNumber;
    private String owner;
    private double balance;
    private double interestRate;

    private BankAccount() {}

    public static class Builder{
        //required
        private int accountNumber;
        //optional
        private String owner;
        private double balance;
        private double interestRate;

        public Builder(int accountNumber){
            this.accountNumber = accountNumber;
        }

        public Builder setOwner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder setBalance(double balance){
            this.balance = balance;
            return this;
        }

        public Builder setInteresRate(double interesRate){
            this.interestRate = interesRate;
            return this;
        }

        public BankAccount build(){
            BankAccount bankAccount = new BankAccount();
            bankAccount.setAccountNumber(accountNumber);
            bankAccount.setOwner(owner);
            bankAccount.setBalance(balance);
            bankAccount.setInterestRate(interestRate);
            return bankAccount;
        }
    }

    //getters, setters -------------------------------------------------------------------
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }
}
