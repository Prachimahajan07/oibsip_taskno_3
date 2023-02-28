package ATMInterface;

public class ATM {
    private double Balance;
    private double Transaction;
    private double withdraw;
    private double deposit;
    private double transfer;
//    private double ;
    public ATM(){

    }

    public double getBalance() {
        return Balance;
    }

    public void setBalance(double balance) {
        Balance = balance;
    }

    public double getTransaction() {
        return Transaction;
    }

    public void setTransaction(double transaction) {
        Transaction = transaction;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTransfer() {
        return transfer;
    }

    public void setTransfer(double transfer) {
        this.transfer = transfer;
    }
}
