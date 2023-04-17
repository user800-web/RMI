/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.projectrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Líder de TIC
 */
public interface Bank extends Remote{
    public void deposit(double amount) throws RemoteException;
    public void withdraw(double amount) throws RemoteException;
    public double getBalance() throws RemoteException;
}
