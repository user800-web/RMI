/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Líder de TIC
 */
public class BankImpl extends UnicastRemoteObject implements Bank{
    private static final long serialVersionUID = 1L;
    private Map<Integer, Account> accounts;

    public BankImpl() throws RemoteException {
        accounts = new HashMap<Integer, Account>();
    }

    @Override
    public void deposit(int accountNumber, double amount) throws RemoteException {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.deposit(amount);
        }
    }

    @Override
    public void withdraw(int accountNumber, double amount) throws RemoteException {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    @Override
    public double getBalance(int accountNumber) throws RemoteException {
        Account account = accounts.get(accountNumber);
        if (account != null) {
            return account.getBalance();
        }
        return 0;
    }

    private class Account {
        private double balance;

        public Account() {
            balance = 0;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }
    }
}
