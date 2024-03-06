import java.util.Scanner;
public class MainBarang27 {
    public static void main(String[] args) {
        Scanner scanner27 = new Scanner(System.in);
        ClassBarang27[] DataOfArray = new ClassBarang27[5];
        while (true) {
            System.out.println("\n===================( MENU )===================\n");
            System.out.println("1. Tampilkan Barang\n \n2. Beli\n \n3. Tampilkan Pembelian\n \n4. Keluar");
            System.out.println("\n==============================================");
            System.out.print("\nMasukkan Opsi Pilihan : ");
            int Pilihan = scanner27.nextInt();
            if (Pilihan == 1) {
                ClassTransaksiBarang27[] ArrayOfBarang27 = new ClassTransaksiBarang27[5];
                for (int i = 0; i < ArrayOfBarang27.length; i++) {
                    ArrayOfBarang27[i] = new ClassTransaksiBarang27(DataOfArray);
                    ArrayOfBarang27[i].CetakInfo();
                }
            }else if (Pilihan == 2) {
                
            }else if (Pilihan == 3) {

            }else if (Pilihan == 4) {

            }else {
                System.out.println("Opsi Yang Anda Pilih Tidak Tersedia");
            }
        }
    }
}