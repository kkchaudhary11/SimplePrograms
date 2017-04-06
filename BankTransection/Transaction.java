package BankTransection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kamal Kant on 06-04-2017.
 */
public class Transaction {

    int balance = 500000;
    int PIN = 1231;
    int withdrawAmount;

    void enterPin() throws TransactionExceptionHandler {
        System.out.print("Enter PIN : ");
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            int temp = Integer.parseInt(bf.readLine());
            if (temp == PIN) {
                getAmmount();
            } else {
                //InvalidPin Exeption
                throw new TransactionExceptionHandler("incorrect PIN");

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    void getAmmount() throws TransactionExceptionHandler {
        System.out.print("Enter the amount to withdraw :");
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            withdrawAmount = Integer.parseInt(bf.readLine());
            if (withdrawAmount < balance) {
                if (withdrawAmount > 200000) {
                    getPAN();
                } else {
                    balance = balance - withdrawAmount;
                    System.out.println("Transaction Successful");
                    System.out.println("Remaining Balance : ₹" + balance);
                }
            } else {
                //InsufficentBalance Exception
                throw new TransactionExceptionHandler("Insufficient Balance");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    void getPAN() throws TransactionExceptionHandler {
        System.out.print("Enter PAN Details : ");
        try {
            BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));
            String PanDetail = (bf2.readLine());
            if (PanDetail.length() == 10) {
                balance = balance - withdrawAmount;
                System.out.println("Transaction Successful");
                System.out.println("Remaining Balance : ₹" + balance);
            } else {
                //transaction failed
                throw new TransactionExceptionHandler("Transaction Failed");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Transaction transaction = new Transaction();
        try {
            transaction.enterPin();
        } catch (TransactionExceptionHandler e) {
            System.out.println("Exception Occured :: " + e.getMessage());
        }

    }
}