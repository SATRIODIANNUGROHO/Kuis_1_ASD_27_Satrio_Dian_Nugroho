import java.util.Scanner;
public class ClassTransaksiBarang27 {
    public ClassTransaksiBarang27(ClassBarang27[] DataOfArray) {
        ArrayOfBarang27 = DataOfArray;
    }
    Scanner scanner27 = new Scanner(System.in);
    String[] Kode = {"K001", "K002", "K003", "K004", "K005"};
    String[] Nama = {"Sabun", "Shampoo", "Sikat Gigi", "Biore", "Pasta Gigi"};
    double[] Harga = {5000, 10000, 12000, 32000, 10000};
    int[] Stok = {10, 5, 10, 10, 10};
    ClassBarang27[] ArrayOfBarang27 = new ClassBarang27[5];
    public void CetakInfo() {
        for (int i = 0; i < ArrayOfBarang27.length; i++) {
            System.out.println("\n--------------------------------------------");
            System.out.println("Kode : " + (Kode[i]) + " Nama : " + (Nama[i]) + " Harga : " + (Harga[i]) + " Stok : " + (Stok[i]));
        }
    }
}
