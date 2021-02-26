import java.util.Scanner;

public class ödev1 {
    public static void main(String[] args) {
        int kredi_kart_no;
        Scanner girdi= new Scanner(System.in);
        System.out.println("kredi notunu gir: ");
        kredi_kart_no = girdi.nextInt();

       String str_değeri = Integer.valueOf( kredi_kart_no ).toString();
       if (str_değeri.length() >= 5) {
           System.out.println("Birinci sayi: " +str_değeri.charAt(0));
           System.out.println("Birinci sayi: " +str_değeri.charAt(1));
           System.out.println("Birinci sayi: " +str_değeri.charAt(str_değeri.length() - 1));
    } else {
           System.out.println("Hatali kredi karti nı girildi");
       }
}}
