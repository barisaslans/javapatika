import java.util.Scanner;

public class C10_SinifGecmeDurumu {

    public static void main(String[] args) {

    int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuz");
        mat = input.nextInt();
        if(mat<0 || mat>100){
            System.out.println("Gecersiz mat notu girdiniz Ortalamaya katilmayacak");
            mat= 0;
        }
        System.out.println("Fizik notunuz");
        fizik= input.nextInt();
        if (fizik<0 || fizik>100){
            System.out.println("Gecersiz fizik notu girdiniz Ortalamaya katilmayacak");
            fizik=0;
        }

        System.out.println("Turkce notunuz");
        turkce = input.nextInt();
        if (turkce<0 || turkce>100){
            System.out.println("Gecersiz turkce notu girdiniz Ortalamaya katilmayacak");
            turkce=0;
        }

        System.out.println("Kimya notunuz");
        kimya= input.nextInt();
        if (kimya<0 || kimya>100){
            System.out.println("Gecersiz kimya notu girdiniz Ortalamaya katilmayacak");
            kimya=0;
        }

        System.out.println("Muzik notunuz");
        muzik= input.nextInt();
        if (muzik<0 || muzik>100){
            System.out.println("Gecersiz kimya notu girdiniz Ortalamaya katilmayacak");
            muzik=0;
        }

        double average = (mat + fizik + turkce + kimya + muzik) /5;

        if(average<=55){
            System.out.println("Sinifta kaldiniz, seneye tekrar gorusmek uzere");
        }else {
            System.out.println("Tebrikler sinifi gectinz");
        }
        System.out.println("Ortalamaniz " + average);



    }
}
