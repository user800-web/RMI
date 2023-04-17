/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectrmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
/**
 *
 * @author Líder de TIC
 */
public class BankServer {
    public static void main(String[] args) {
        try {
            BankImpl bank = new BankImpl();
            Registry registry = LocateRegistry.createRegistry(1098);
            Naming.rebind("Bank", bank);
            System.out.println("Bank server ready");
        } catch (Exception e) {
            System.err.println("Bank server exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
