import java.util.Scanner;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = input.nextDouble();

        double luasPermukaan = luaspermukaan(panjang, lebar, tinggi);

        System.out.println("Luas permukaan balok adalah " + luasPermukaan);
    }

    /**
     *
     * @param panjang dari sebuah balok
     * @param lebar dari sebuah balok
     * @param tinggi dari sebuah balok
     * @return mengembalikan nilai luas permukaan balok
     */
    private static double luaspermukaan(double panjang, double lebar, double tinggi) {
            return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        }

}
