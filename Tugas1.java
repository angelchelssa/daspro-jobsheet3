import java.util.Scanner;
/**
 * Tugas1
 */
public class Tugas1 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double tarifListrik = 1500;
        System.out.print("Jumlah penggunaan listrik: ");
        double Penggunaan = input.nextDouble();

        double totalTagihan = tarifListrik * Penggunaan;
        boolean banyakPenggunaan = Penggunaan > 500;
        System.out.println("total tagihan listrik: Rp " + totalTagihan);
        System.out.println("melebihi 500 atau tidak = " +banyakPenggunaan);

        
    }
}