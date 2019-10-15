/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118080.latihan39.terbesarterkecil.oop;

import java.util.Scanner;

/**
 *
 * @author Trizky
 */
public class PBO210118080Latihan39TerbesarTerkecilOop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Petugas a = new Petugas();
        Mahasiswa mhs = new Mahasiswa();
        System.out.println("====== Program Nilai Terbesar Dan Terkecil Mahasiswa =====");
        System.out.print("Masukan Nama Petugas \t\t\t: ");
        Scanner Nm = new Scanner(System.in);
        a.setNama(Nm.nextLine());
        System.out.print("Masukan Banyaknya Nilai Mahasiswa \t: ");
        Scanner banyak = new Scanner(System.in);
        mhs.setBanyakMhs(banyak.nextInt());
        mhs.InputNilai();
        //output
        System.out.println("");
        System.out.println("======= Hasil Nilai Mahasiswa =======");
        mhs.getNilai();
        System.out.println("");
        System.out.println("Nilai Terbesar adalah "+mhs.Terbesar());
        System.out.println("Nilai Terkecil adalah "+mhs.Terkecil());
        System.out.println("");
        System.out.println("Petugas : "+a.getNama());
        System.out.println("Developed by Taufiq Rizky");
    }
    
}
