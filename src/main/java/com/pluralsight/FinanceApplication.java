package com.pluralsight;

import com.pluralsight.finance.BankAccount;
import com.pluralsight.finance.Valuable;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("123", "Pam", 12500);
        Valuable account2 = new BankAccount("456", "Gary", 1500);

        bankAccount1.deposit(100);
        account2.deposit(100);
    }
}
