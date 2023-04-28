import java.util.Scanner;

public class UcgenAlan {
    public static void main(String[] args) {
        double a , b , c , u , alan , cevre;
        Scanner input = new Scanner(System.in);
        System.out.print("Üçgenin ilk kenar uzunluğunu giriniz:");
        a = input.nextDouble();
        System.out.print("Üçgenin ikinci kenar uzunluğunu giriniz:");
        b = input.nextDouble();
        c = Math.sqrt((a*a)+(b*b));
        u = (a+b+c)/2;
        cevre = 2*u;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c)) ;
        System.out.println("Üçgenin Hipotenüs Uzunluğu:" + c);
        System.out.println("Üçgenin çevre uzunluğu:" + cevre);
        System.out.print("Üçgenin alanı:" + alan );
    }
}

