package TugasPT5;
import java.util.*;

public class diskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Total Belanja Rp. : ");
        double belanja = input.nextDouble();
        
        double diskon;
        
        if (belanja < 50000) {
            diskon = belanja * 0.05;
        } else {
            diskon = belanja * 0.20;
        }
        
        double totalBayar = belanja - diskon;
        
        System.out.println("\nHasil:");
        System.out.println("Total Belanja Rp. = " + belanja);
        System.out.println("Diskon Rp. = " + diskon);
        System.out.println("Total Bayar Rp. = " + totalBayar);
    }
}
