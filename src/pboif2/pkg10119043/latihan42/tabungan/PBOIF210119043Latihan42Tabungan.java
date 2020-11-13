/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan42.tabungan;
import java.util.Scanner;
/**
 *
 * @author FERMI
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program menghitung tabungan
 */
public class PBOIF210119043Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static int saldo;
    public static int jumlah;
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Program Penarikan Uang====");
        System.out.print("Masukan Saldo Awal : ");
        saldo = scanner.nextInt();
        Tabungan tabungan = new Tabungan(saldo);
        System.out.print("Jumlah uang yang diambil : ");
        jumlah = scanner.nextInt();
        System.out.println("Saldo anda sekarang " + tabungan.ambilUang(jumlah));
        
        
    }
    
}
