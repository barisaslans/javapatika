import java.util.Scanner;

public class C05_DaireAlan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, mAcisi, alan;

        System.out.print("yaricap degerini giriniz :");
        r = input.nextDouble();

        System.out.print("merkez aci degerini giriniz :");
        mAcisi = input.nextDouble();

        alan = (Math.PI * (r * r) * mAcisi) / 360;
        System.out.print("Daire diliminin alani : " + alan);
    }
}
