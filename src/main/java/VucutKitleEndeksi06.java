import java.util.Scanner;

public class VucutKitleEndeksi06 {

    /*
    Vücut Kitle İndeksi Hesaplama
    Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
    "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

    Formül
    Kilo (kg) / Boy(m) * Boy(m)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double heigth,weight,vki;
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz");
        heigth=input.nextDouble();
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz");
        weight=input.nextDouble();
        vki=weight/(heigth*heigth);
        System.out.println(vki);

    }
}

