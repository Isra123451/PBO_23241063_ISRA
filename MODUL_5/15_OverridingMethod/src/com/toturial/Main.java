package com.toturial;

public class Main {

    public static void main(String[] args) {
        // membuat objek dari superrclass
        Hero hero1 = new Hero ();
        hero1.nama = "saitama";
        System.out.println("Hero dari superclass ");
        hero1.cetak();

        // memebuat objek dari subclass
        HeroTank hero2 = new HeroTank();
        hero2.nama = "super data";
        hero2.defencepower = 200;
        

    }
}
