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

//@Remote
public interface Bank extends Remote{
    void deposit(int accountNumber, double amount) throws RemoteException;
    void withdraw(int accountNumber, double amount) throws RemoteException;
    double getBalance(int accountNumber) throws RemoteException;
}
