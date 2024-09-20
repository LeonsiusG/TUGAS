import java.util.Scanner;

public class DeretAritmatikaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("batas awal: ");
        int awal = scanner.nextInt();
        System.out.print("batas akhir: ");
        int akhir = scanner.nextInt();
        System.out.print("Masukkan beda: ");
        int beda = scanner.nextInt();
        
        System.out.println("Deret aritmatika menggunakan for:");
        for (int i = awal; i <= akhir; i += beda) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
