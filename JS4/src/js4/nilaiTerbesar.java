/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//created by 21343038_AbelLevran
package js4;

/**
 *
 * @author Bellevran
 */
public class nilaiTerbesar {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 23;
        int n3 = 5;
        int max;
        int max1;
        
        max = (n1 >= n2) ? n1 : n2;
        max1 = (max >= n3) ? max : 5;
        
        System.out.println("Number 1 = 10");
        System.out.println("Number 2 = 23");
        System.out.println("Number 3 = 5");
        System.out.println("nilai Terbesar adalah angka = "+max1);
        
    }
}
