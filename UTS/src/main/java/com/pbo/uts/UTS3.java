/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


package com.pbo.uts;

/**
 *
 * @author ASUS
 */

import javax.swing.JOptionPane;

public class UTS3 {
    public static void main(String[] args) {
        int angka;
        String a;
        
        a = JOptionPane.showInputDialog("Masukkan Angka");
        angka = Integer.parseInt(a);
        
        if(angka>0) {
            JOptionPane.showMessageDialog(null,"Angka "+angka+" merupakan bilangan positif" );
        }
        else if(angka<0){
            JOptionPane.showMessageDialog(null, "Angka "+angka+" merupakan negatif" );
        }
        else {
            JOptionPane.showMessageDialog(null, "Angka "+angka+" merupakan bilangan nol" );
        }
    }
}

