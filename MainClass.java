package ATMInterface;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        String userId ="prachi12";
        int userPin=1234;
        AtmOperationInterface op = new AtmOperation();
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to ATM !!!");
        System.out.println("Enter UserID: ");
        String UserID= scn.next();
        System.out.println("Enter UserPin: ");
        int UserPin= scn.nextInt();
        if((UserID.equals(userId))&&(UserPin==userPin)){
            System.out.println("!! Login Successfully !!");
            while (true){
                System.out.println("1.Transaction History\n2.Withdraw\n3.Deposit\n4.Transfer\n5.Quit");
                System.out.println("Enter Your choice");
                int ch = scn.nextInt();
                if(ch==1){
                    op.TransactionHis();
                }
                else if (ch==2) {
                    System.out.println("Enter Amount want to Withdraw: ");
                    double WithDrawAmt= scn.nextDouble();
                    op.WithDraw(WithDrawAmt);

                }
                else if (ch==3){
                    System.out.println("Enter Amount want to Deposit: ");
                    double DepositAmt= scn.nextDouble();
                    op.Deposit(DepositAmt);
                }
                else if (ch==4) {
                    System.out.println("Enter recipient name");
                    String name= scn.next();
                    System.out.println("Enter Amount want to transfer: ");
                    double TransferAmt= scn.nextDouble();
                    op.Transfer(TransferAmt,name);

                }
                else if (ch==5) {
                    System.out.println("Collect Your ATM card\n !! Thank you !!");
                    System.exit(0);
                }
            }

        }
        else{
            System.out.println("Enter correct UserId and Pin !!");
            System.exit(0);
        }

    }
}
