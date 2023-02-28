package ATMInterface;

import java.util.HashMap;
import java.util.Map;

public class AtmOperation implements AtmOperationInterface{
    ATM atm= new ATM();
    Map<Double,String> TraHis = new HashMap<>();
    @Override
    public void Balance(){

    }
    @Override
    public void TransactionHis() {
        for(Map.Entry<Double,String> m:TraHis.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
        System.out.println("Transaction History is "+ atm.getTransaction());
    }

    @Override
    public void WithDraw(double WithDrawAmt) {
        if(WithDrawAmt<= atm.getBalance()){
            if(WithDrawAmt%500==0){
                TraHis.put(WithDrawAmt,"Amount Withdrawn");
                System.out.println("Collect the cash "+WithDrawAmt);
                atm.setBalance(atm.getBalance()+WithDrawAmt);
                Balance();
            }
            else{
                System.out.println("Enter amount multiple of 500.0");
            }
        }
        else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public void Deposit(double DepositAmt) {
        TraHis.put(DepositAmt,"Amount Deposit");
        System.out.println("Amount is Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+DepositAmt);
        Balance();
    }

    @Override
    public void Transfer(double TransferAmt,String name) {
        TraHis.put(TransferAmt,"Amount Transfer to "+name);
        System.out.println("Amount transfer Successfully !!");
        atm.setBalance(atm.getBalance()+TransferAmt);
        Balance();

    }
}
