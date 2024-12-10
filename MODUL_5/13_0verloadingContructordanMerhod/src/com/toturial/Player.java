package com.toturial;

public class Player {
    // atribut
    private String name;
    private static int jumlahPlayer;

    // kontruktor
    // opsi pertama untuk membuat objek
    Player (String name){
        Player.jumlahPlayer++;
        this.name = name;
    }
    // overloading construktor
    // opsi 2 untuk memebuat objek
    Player(){
        Player.jumlahPlayer++;
        this.name = "player"+ Player.jumlahPlayer;
    }
       
    // method 
    void cetak (){
        System.out.println("name:"+ this.name);
    }
}     

