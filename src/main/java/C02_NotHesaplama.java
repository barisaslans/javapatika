import java.util.Scanner;

public class C02_NotHesaplama {
    public static void main(String[] args) {
        // Değişkenleri oluştur.
        int Mat, Fizik, Kimya, Turkce, Muzik, Tarih;
// Scanner sınıfımızı tanımladık.
        Scanner input= new Scanner (System.in);
        //Kullanıcıdan değerleri al.
        System.out.print("Matematik notunuz : ");
        Mat = input.nextInt();
        System.out.print("Fizik notunuz : ");
        Fizik =input.nextInt();
        System.out.print("Kimya notunuz : ");
        Kimya= input.nextInt();
        System.out.print("Türkçe notunuz : ");
        Turkce=input.nextInt();
        System.out.print("Müzik notunuz : ");
        Muzik=input.nextInt();
        System.out.print("Tarih notunuz : ");
        Tarih=input.nextInt();
        int toplam =(Mat+Fizik+Kimya+Turkce+Muzik+Tarih );
        double sonuc= toplam/6.0;
        System.out.println("Ortalamanız :"+ sonuc);
        int ortalama = (int)sonuc; //Ortalama notu tam sayıya dönüştür.
        boolean kaldiniz = sonuc < 50;
        boolean gectiniz = sonuc >= 50;
        System.out.println("Kaldı mı? " + kaldiniz);
        System.out.println("Geçti mi? " +  gectiniz);
    }
}
