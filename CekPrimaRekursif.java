import java.util.Scanner;
public class CekPrimaRekursif {
    
    static boolean cekPrimaRekursif(int n, int i) {
        if (i <= 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return cekPrimaRekursif(n, i - 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();
        boolean hasilCekPrima = cekPrimaRekursif(n, n / 2);
        if (hasilCekPrima) {
        System.out.println(n + " adalah bilangan prima.");
        } else {
            System.out.println(n + " bukan bilangan prima.");
        }
    }
}