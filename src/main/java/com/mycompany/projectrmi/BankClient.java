/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectrmi;

import java.rmi.Naming;
//import java.rmi.RemoteException;
import java.util.Scanner;
/**
 *
 * @author Líder de TIC
 */
public class BankClient {
    public static void main(String[] args) {
        try {
            Bank bank = (Bank) Naming.lookup("Bank");
            Scanner scanner = new Scanner(System.in);
            
            while (true) {
                System.out.println("Menú del Banco:");
                System.out.println("1. Depósito");
                System.out.println("2. Retiro");
                System.out.println("3. Consultar saldo");
                System.out.println("4. Salir");
                System.out.print("Ingresa una opción: ");
                int option = scanner.nextInt();
                
                switch (option) {
                    case 1:
                        System.out.print("Escriba el monto a depositar: ");
                        double depositAmount = scanner.nextDouble();
                        bank.deposit(depositAmount);
                        break;
                    case 2:
                        System.out.print("Escriba el monto a retirar: ");
                        double withdrawAmount = scanner.nextDouble();
                        bank.withdraw(withdrawAmount);
                        break;
                    case 3:
                        System.out.println("Saldo disponible: " + bank.getBalance());
                        break;
                    case 4:
                        System.exit(0);
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
