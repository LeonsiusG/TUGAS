import java.util.Scanner;

public class DeretAritmatikaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("batas awal: ");
        int awal = scanner.nextInt();
        System.out.print("batas akhir: ");
        int akhir = scanner.nextInt();
        System.out.print("Masukkan beda: ");
        int beda = scanner.nextInt();
        
        System.out.println("Deret aritmatika menggunakan while:");
        int i = awal;
        while (i <= akhir) {
            System.out.print(i + " ");
            i += beda;
        }
        System.out.println(); 
    }
}
