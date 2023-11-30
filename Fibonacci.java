import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int bulan = 12;
        int jumlahPasangan = jumlahMarmut(bulan);
        System.out.println("Jumlah pasangan marmut pada akhir bulan ke-" + bulan + " adalah " + jumlahPasangan);
    }
    public static int jumlahMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return jumlahMarmut(bulan - 1) + jumlahMarmut(bulan - 2);
        }
    }
}