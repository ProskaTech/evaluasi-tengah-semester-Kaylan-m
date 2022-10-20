/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.uts;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class UTS2 {
    public static void main(String[] args) {
    int i;
    int j;
    int jmlbaris;

    Scanner input = new Scanner(System.in);
    System.out.print("Masukan Jumlah Baris : ");
    jmlbaris = input.nextInt();
    
    for (i=1; i<=jmlbaris; i++)
    {
        for (j=1; j<=i; j++)
        {
            System.out.print(" ");
        }
            for (j=5; j>=i; j--)
            {
                System.out.print("#");
                System.out.print(" ");
            }
        System.out.println();
    }
    
    for (i=1; i<=jmlbaris; i++)
    {
        for (j=5; j>=i; j--)
        {
            System.out.print(" ");
        }
            for (j=1; j<=i; j++)
            {
                System.out.print("*");
                System.out.print(" ");
            }
                System.out.println();
    }

    }
}