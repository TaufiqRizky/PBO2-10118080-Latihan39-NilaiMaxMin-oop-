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
public class Mahasiswa {
    private int BanyakMhs;
    public int[] nilai;

    public int getBanyakMhs() {
        return BanyakMhs;
    }

    public void setBanyakMhs(int BanyakMhs) {
        this.BanyakMhs = BanyakMhs;
    }
    
    public void InputNilai(){
        int j = getBanyakMhs();
        nilai= new int[j];
        for (int i = 0; i < j; i++) {
            System.out.print("Nilai Mahasiswa Ke-"+(i+1)+" :");
            Scanner N = new Scanner(System.in);
            nilai[i]=N.nextInt();
        }
    }
    
    public  int Terbesar() {
        int max = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        return max;
    }
    public int Terkecil() {
        int min = nilai[0];
        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }
        return min;
    }
    public void getNilai(){
        for (int i = 0; i < getBanyakMhs(); i++) 
            System.out.println("Nilai Mahasiswa Ke-"+(i+1)+" :" +nilai[i]);
    }
    
}
