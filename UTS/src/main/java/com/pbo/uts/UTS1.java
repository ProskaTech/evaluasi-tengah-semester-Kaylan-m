/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pbo.uts;

/**
 *
 * @author ASUS
 */
public class UTS1 {
   public static void main(String[] args){
        int space,i;
        int number = 9;
        int current = 4;
        int number2 = 9;
        int current2 = 9;

        while(current<9){
            space = (number - current) / 4;
            for(i=0;i<space;i++){
                System.out.print(" ");
            }
            for(i=space+1;i<current/2+space+1;i++){
                System.out.print(i);
            }
            for(i=0;i<space;i++){
                System.out.print(" ");
            }
            System.out.print(" ");
            for(i=0;i<space;i++){
                System.out.print(" ");
            }
            for(i=space+1+current/2;i<current/2+space+1+current/2;i++){
                System.out.print(i);
            }
            System.out.println(" ");
            current = current * 2;
        }

        while(current2>0){
            space = (number2-current2) / 2;
            for(i=0;i<space;i++){
                System.out.print(" ");
            }
            for(i=1;i<current2+1;i++){
                System.out.print(i);
            }
            for(i=0;i<space;i++){
                System.out.print(" ");
            }
            System.out.println(" ");
            current2 = current2-2;
        }
    }
}
    
