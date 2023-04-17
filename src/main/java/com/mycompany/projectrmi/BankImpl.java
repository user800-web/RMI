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
//@Remote
public class BankImpl extends UnicastRemoteObject implements Bank{
    
    private double[] accounts;
    

    public BankImpl() throws RemoteException {
        accounts = new double[2];
    }

    public void deposit(int accountNumber, double amount) throws RemoteException {
        accounts[accountNumber - 1] += amount;
    }

    public void withdraw(int accountNumber, double amount) throws RemoteException {
        accounts[accountNumber - 1] -= amount;
    }

    public double getBalance(int accountNumber) throws RemoteException {
        return accounts[accountNumber - 1];
    }
}
