/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Líder de TIC
 */
public class BankImpl extends UnicastRemoteObject implements Bank{
    private double balance;

    public BankImpl() throws RemoteException {
        super(); //aqui
        balance = 0;
    }
//D´EPOSITO
    @Override
    public void deposit(double amount) throws RemoteException {
        balance += amount;
    }
//RETIRAR
    @Override
    public void withdraw(double amount) throws RemoteException {
        balance -= amount;
    }
//OBTENER SALDO
    @Override
    public double getBalance() throws RemoteException {
        return balance;
    }
}
