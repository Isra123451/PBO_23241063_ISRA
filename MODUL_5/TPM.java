package com.tutorial;

import java.util.Scanner;

public class TPM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // luas persegi
        System.out.print("masukkan panjang sisi persegi:");
        double sisi = scanner.nextDouble();
        double luas = Math.pow(sisi, 2);
        System.out.println("luas persegi:" + luas);

        // Keliling persegi
        System.out.print("masukkan panjang sisi persegi:");
        sisi = scanner.nextDouble();
        double keliling = 4 * sisi;
        System.out.println("keliling persegi:" + keliling);

        // luas persegi panjang
        System.out.print("masukkan panjang persegi panjang:");
        double panjang = scanner.nextDouble();
        System.out.print("masukkan lebar persegia panjang:");
        luas = panjang * luas;
        System.out.println("luas persegi panjang:" + luas);

        // keliling persegi panjang
        System.out.print("masukkan panjang persegi panjang:");
        panjang = scanner.nextDouble();
        System.out.println("masukkan lebar persegi panjang:");
        panjang = scanner.nextDouble();
        keliling = 2 * (panjang + keliling);
        System.out.println("keliling persegi panjang:" + keliling);

        // luas lingkaran
        System.out.print("masukkan jari-jari lingkaran");
        double jarijari = scanner.nextDouble();
        luas = 2 * Math.PI * jarijari;
        System.out.println("keliling lingkaran:" + keliling);

        // luas segitiga
        System.out.print("masukkan alas segitiga:");
        double alas = scanner.nextDouble();
        System.out.print("masukkan tinggi segitiga:");
        double tinggi = scanner.nextDouble();
        luas = 0.5 * alas * tinggi;
        System.out.println("luas segitiga:" + luas);

        // keliling segitiga
        System.out.print("masukkan panjang sisi pertama segitiga:");
        double sisi1 = scanner.nextDouble();
        System.out.print("masukkan panjang sisi kedua segitigan:");
        double sisi2 = scanner.nextDouble();
        System.out.print("masukkan panjang sisi ketiga segitigan:");
        double sisi3 = scanner.nextDouble();
        keliling = sisi1 + sisi2 + sisi3;
        System.out.println("keliling segitiga:" + keliling);
    }
}
