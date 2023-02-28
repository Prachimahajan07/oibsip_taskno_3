package ATMInterface;

public interface AtmOperationInterface {
    public void Balance();
    public void TransactionHis();
    public void WithDraw(double WithDrawAmt);
    public void Deposit(double DepositAmt);
    public void Transfer(double TransferAmt,String name);
}
