class Player {
    // data memeber atau Variabel instant
    String nama; // default,bisa diakses dari luar class 
    public int exp; // public, bisa diakses dari luar class

    // konstruktor, dampa modifien   access 
    Player (String nama,int exp){
        this.nama = nama;
        this.exp = exp;
    }

public class App {
    public static void main(String[] args) throws Exception {
        // instansisas objek
        Player Player1 = new Player("mustiati", 0);

        // default
        // membaca data 
        System.out.println(Player1.nama);
        // menulis data
        Player1.nama = "tya";
        System.out.println(Player1.nama);
      //  public 
      // membaca data 
      System.out.println()
    }
}
}