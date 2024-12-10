package com.toturial;

public class HeroTank extends Hero {
    // overriding 
    double defencepower;

    // overriding method 
    void cetak (){ 
        System.out.println("Hero dari  Subclass");
        System.out.println("Hero tank");
        System.out.println("Hero name :" + this.nama );
        System.out.println("defencepower :" +this.defencepower);
        
    }
}