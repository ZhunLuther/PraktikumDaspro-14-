import java.util.Scanner;
public class studyCase14 {
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     int hargaPerCup = 1800;
     int totalHarga, diskon, totalBayar;
     int jumlahCup, uangBayar, kembalian, kurang;


     System.out.println("Masukkan jumlah cup yang dibeli: ");
     jumlahCup = input.nextInt();
     System.out.println("Masukkan uang yang dibayarkan: ");
     uangBayar = input.nextInt();

     totalHarga = hargaPerCup * jumlahCup;
     diskon = 0;
     if (totalHarga >= 10000) {
         diskon = totalHarga * 10 / 100;
     }
     totalBayar = totalHarga - diskon;
     System.out.println("Total harga: " + totalHarga);
     System.out.println("Diskon: " + diskon);
     System.out.println("Total yang harus dibayar: " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("Kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang yang dibayarkan kurang sebesar: " + kurang);
        }
    input.close();
    }
}