import java.util.Scanner;

public class DeretDescendingRekursif {
    static void deretDescendingRekursif(int n) {
        if (n >= 0) {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }
    static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.print("Deret Descending Rekursif: ");
        deretDescendingRekursif(n);
        System.out.print("\nDeret Descending Iteratif: ");
        deretDescendingIteratif(n);
    }
}
