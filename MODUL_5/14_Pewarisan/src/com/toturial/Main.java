package com.toturial;

public class Main {
    public static void main(String[] args) {
        // membuat
        Hero hero1 = new Hero ();
        hero1.name ="goku";
        hero1.cetak();
        
        // membuat objek dari class 
        HeroStrength hero2 = new HeroStrength();
        hero2.name ="NARUTO";
        hero2.cetak();

        HeroIntell hero3 = new HeroIntell();
        hero3.name ="SAKURA";
        hero3.cetak();
        
    }
}
