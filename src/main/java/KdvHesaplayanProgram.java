import java.util.Scanner;

public class KdvHesaplayanProgram {

    /*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/
        public static void main(String[] args) {
            double fiyat;
            double kdvliFiyat = 0.0;
            double kdvOrani;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ürün fiyatini giriniz : ");
            fiyat = scanner.nextDouble();

            if (fiyat < 1000) {
                kdvOrani = 0.18;
                kdvliFiyat += fiyat + fiyat * kdvOrani;
            }
            else {
                kdvOrani=0.08;
                kdvliFiyat += fiyat + fiyat * kdvOrani;
            }

            System.out.println("KDV'siz Fiyat : " + fiyat);
            System.out.println("KDV tutarı : :"+kdvOrani);
            System.out.println("KDV'li fiyat :"+kdvliFiyat);

        }
    }

