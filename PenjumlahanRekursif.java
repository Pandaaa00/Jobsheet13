import java.util.Scanner;
public class PenjumlahanRekursif {
    static int hitungPenjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + hitungPenjumlahanRekursif(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkkan nilai n = ");
        int nilaiN = sc.nextInt();

        System.out.print("Maka dihasilkan ");
        for (int i = 1; i <= nilaiN; i++) {
            System.out.print(i);
        if (i < nilaiN) {
            System.out.print("+");
        }
    }
    int hasilPenjumlahan =hitungPenjumlahanRekursif(nilaiN);
    System.out.println(" = " + hasilPenjumlahan);
    }
}