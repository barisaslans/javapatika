import java.util.Scanner;

public class C09_KullaniciGirisi {

    public static void main(String[] args) {

        String userName, password;
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici Adiniz");
        userName= input.nextLine();

        System.out.println("Sifreniz");
        password= input.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Basarili giris yaptiniz");
        }else {
            System.out.println("Bilgileriniz yanlis");

            System.out.println("Sifrenizi sifirlamak ister misiniz? (evet/hayir): ");
            String cevap = input.nextLine();

            if (cevap.equalsIgnoreCase("evet")) {
                System.out.println("Yeni sifrenizi girin : ");
                String yeniSifre = input.nextLine();


                if (!yeniSifre.equals("java123")){
                    System.out.println("Sifre olusturuldu");
                }else {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz");
                }
            }
        }



    }
}
