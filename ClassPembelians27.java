import java.util.Scanner;
public class ClassPembelians27 {
    public ClassPembelians27(ClassBarang27[] DataOfArray) {
        ArrayOfClassBarang27 = DataOfArray;
    }
    Scanner scanner27 = new Scanner(System.in);
    ClassBarang27[] ArrayOfClassBarang27 = new ClassBarang27[5];
    public void CetakInfo() {
        while (true) {
            System.out.print("\nMasukkan Kode Barang : ");
            String Kode = scanner27.next();
            System.out.print("Apakah Anda Akan Belanja Lagi [Y/N] : ");
            String Opsi = scanner27.next();
            if (Opsi.equalsIgnoreCase("y")) {
                continue;
            }else if (Opsi.equalsIgnoreCase("n")) {
                break;
            }else {
                System.out.println("Opsi Yang Anda Pilih Tidak Tersedia");
            }
        }
    }
}