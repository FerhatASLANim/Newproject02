import java.util.Scanner;

public class ödev02 {

    public static void main(String[] args) {
        String isim, soy_isim;
        Scanner girdi = new Scanner(System.in);
        System.out.println("isminizi giriniz :");

        isim= girdi.next();
        System.out.println("soyadınızı giriniz :");

        soy_isim= girdi.next();

        System.out.println("İsminizin ilk harfi Büyük Olarak: " +isim.toUpperCase().charAt(0));
        System.out.println("Soyadınızın ilk harfi Büyük Olarak: " +soy_isim.toUpperCase().charAt(0));


    }
}
