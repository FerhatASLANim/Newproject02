import java.util.Locale;
import java.util.Scanner;

class ödev03 {

    public static void main(String[] args) {
        String ülke_isim;
        Scanner girdi = new Scanner(System.in);
        System.out.println("Yaşadığınız ülke adını giriniz :");

        ülke_isim= girdi.next();
        ülke_isim= ülke_isim.toLowerCase(Locale.ROOT);
        if (ülke_isim.equals("Amerika".toLowerCase(Locale.ROOT))) {
            System.out.println("USA");
        } else if ( ülke_isim.equals("Almanya")) {
            System.out.println("DE");
        } else {
            System.out.println("NAH");
        }




    }
}
