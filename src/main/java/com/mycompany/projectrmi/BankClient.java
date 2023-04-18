/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectrmi;

import java.rmi.Naming;
//import java.rmi.RemoteException;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class BankClient {
    public static void main(String[] args) {
        try {
            Bank bank = (Bank) Naming.lookup("rmi://localhost/Bank");
            
            while (true) {
                String menu = JOptionPane.showInputDialog("     Banco RMI     \n\n   Menú del Banco   \n"
                +"1. Depósito\n"
                +"2. Retiro\n"
                +"3. Consultar saldo\n\n"
                +"Cancelar para salir\n\n");
                
                int accountNumber1=0;
                
                switch (menu) {
                    case "1":
                        accountNumber1 = Integer.parseInt( JOptionPane.showInputDialog("Escriba número de cuenta para depositar: "));
                        double depositAmount = Integer.parseInt( JOptionPane.showInputDialog("Escriba el monto a depositar: "));
                        bank.deposit(accountNumber1, depositAmount);
                        JOptionPane.showMessageDialog(null, "Se ha depositado $"+depositAmount+" al Cliente "+accountNumber1);
                        break;
                    case "2":
                        accountNumber1 = Integer.parseInt( JOptionPane.showInputDialog("Escriba número de cuenta para retirar: "));
                        double withdrawAmount = Integer.parseInt( JOptionPane.showInputDialog("Saldo disponible: $"+bank.getBalance(accountNumber1)
                                +"\nEscriba el monto a retirar: "));
                        bank.withdraw(accountNumber1, withdrawAmount);
                        JOptionPane.showMessageDialog(null, "Se ha retirado $"+withdrawAmount+" de la cuenta del Cliente "+accountNumber1);
                        break;
                    case "3":
                        accountNumber1 = Integer.parseInt( JOptionPane.showInputDialog("Escriba número de cuenta a consultar: "));
                        JOptionPane.showMessageDialog(null, "La cuenta del Cliente "+accountNumber1+" tiene un saldo de $"+bank.getBalance(accountNumber1));
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
            }
        } catch (Exception e) {
            System.err.println("Bank client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
