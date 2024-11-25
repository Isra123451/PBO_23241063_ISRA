class GajiBersih {
    // Variabel instance (semua private)
    private int gajiPokok;
    private int tunjangan;
    private double pajakPersen;

    // Getter untuk gaji pokok (constructor, tanpa modifator akses)
    public int getGajiPokok() {
        return this.gajiPokok;

    }

    // Setter untuk gaji pokok (dengan validasi)
    public void setGajiPokok(int gajiPokok) {
        if (gajiPokok < 0) {
            System.out.println("Gaji pokok tidak boleh negatif!");
            return;
        }
        this.gajiPokok = gajiPokok;
    }

    // Getter untuk tunjangan
    public int getTunjangan() {
        return this.tunjangan;
    }

    // Setter untuk tunjangan (dengan validasi)
    public void setTunjangan(int tunjangan) {
        if (tunjangan < 0) {
            System.out.println("Tunjangan tidak boleh negatif!");
            return;
        }
        this.tunjangan = tunjangan;
    }

    // Getter untuk pajakPersen
    public double getPajakPersen() {
        return this.pajakPersen;
    }

    // Setter untuk pajakPersen (dengan validasi)
    public void setPajakPersen(double pajakPersen) {
        if (pajakPersen < 0 || pajakPersen > 100) {
            System.out.println("Pajak harus antara 0% dan 100%!");
            return;
        }
        this.pajakPersen = pajakPersen;
    }

    // Method untuk menghitung dan menampilkan gaji bersih
    public void cetakGajiBersih() {
        double pajakRupiah = (pajakPersen / 100) ;
        double gajiBersih =  pajakRupiah;

        System.out.println("\n--- Rincian Gaji ---");
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Tunjangan: " + tunjangan);
        System.out.println("Pajak (" + pajakPersen + "%): " + pajakRupiah);
        System.out.println("Gaji Bersih: " + gajiBersih);
        System.out.println("--------------------\n");
    }
}

public class Main {
    public static void main(String[] args) {
        GajiBersih karyawan = new GajiBersih();
        karyawan.setGajiPokok(5000000);
        karyawan.setTunjangan(1000000);
        karyawan.setPajakPersen(10);
        karyawan.cetakGajiBersih();
    }
}