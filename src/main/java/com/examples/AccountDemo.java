package com.examples;

public class AccountDemo {

    public static void main(String args[]) {
        Account acc = new Account("Sam", 1234, "Hyderabad", "Saving");
        Account acc1 = new Account("Sam", 1234, 1000);
        System.out.printf("Second Method Current Balance - %.0f\n", acc1.getBalance());
        System.out.printf("Current Balance withdrawal - %.0f\n", acc1.withdraw(500));
        System.out.printf("Current Balance deposit - %.0f\n", acc1.deposit(1000));
        System.out.printf("getBalance - %.0f\n", acc1.getBalance());
        System.out.println("Details - " + acc.getDetails());
        System.out.println(12 >> 0);
        System.out.println(12 >> 1);
        System.out.println(12 >> 2);
        System.out.println(12 >> 3);
        System.out.println(12 >> 4);
        System.out.println(12 >> 5);
        System.out.println(12 >> 6);

    }
}
