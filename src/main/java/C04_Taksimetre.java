import java.util.Scanner;

public class C04_Taksimetre {


/*
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */

        public static void main(String[] args) {
            double km,toplamucret;
            Scanner input = new Scanner(System.in);
            System.out.println("Mesafeyi km cinsinden giriniz");
            km=input.nextDouble();
            toplamucret=(km*2.20)+10;
            System.out.println(toplamucret<20? "Ücret 20 lira":toplamucret);
        }
    }

