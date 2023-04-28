import java.util.Scanner;

public class DaireninCevresiAlani {

    public static void main(String[] args) {
        double r,alan,cevre;
        Scanner input=new Scanner(System.in);
        System.out.println("Dairenin yaricapini giriniz");
        r= input.nextDouble();
        alan=3*r*r;
        cevre=2*3*r;
        System.out.println("Alan :" + alan);
        System.out.println("Cevre :" + cevre);


    }
}

