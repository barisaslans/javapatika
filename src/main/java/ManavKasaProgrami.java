import java.util.Scanner;

public class ManavKasaProgrami {

    /*
        Manav Kasa Programı
    Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
     toplam tutarını ekrana yazdıran programı yazın.
    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double toplamtutar;
        double armut, elma, domates, muz, patlican;
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5;
        System.out.println("Armut kaç kilo?");
        armut = input.nextDouble();
        System.out.println("Elma kaç kilo?");
        elma = input.nextDouble();
        System.out.println("Domates kaç kilo?");
        domates = input.nextDouble();
        System.out.println("Muz kaç kilo?");
        muz = input.nextDouble();
        System.out.println("Patlıcan kaç kilo?");
        patlican = input.nextDouble();
        toplamtutar = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlican * patlicanFiyat);
        System.out.println(toplamtutar);

    }
}
