/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10117061.latihan11.formating;

/**
 *
 * @author Fachrian Harits Pratama
 * Nama                 : Fachrian Harits Pratama
 * Kelas                : PBO2
 * NIM                  : 10117061
 * Deskripsi program    : Program ini berisi program  untuk menampilkan tipe 
 *                        data dengan pengaturan tapilan isi variabel
 */
public class PBO10117061Latihan11Formating {
    
    public static void main(String[] args) {
       int i = 3456764;
       int iMinus = -1;
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n", i );
        System.out.printf("%%10d : %10d%n", i );
        System.out.printf("%%+10d : %+10d%n", i );
        System.out.printf("%%+10d : %+10d%n", iMinus );
        System.out.printf("%%,10d : %,10d%n", i );
        System.out.printf("%%-10d : %-10d%n", i );
        double f = 5675482.982;
        System.out.println("f : " + f);
        System.out.printf("%%f : %f%n", f );
        System.out.printf("%%.2f : %.2f%n", f );
        System.out.printf("%%12.2f : %12.2f%n", f );
        System.out.printf("%%,12.2f : %,12.2f%n", f );
    }
    
}
