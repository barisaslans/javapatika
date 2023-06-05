import java.util.Scanner;

public class C15_CinZodyagi {

    public static void main(String[] args) {

        int dogumYili;
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dogum yilinizi giriniz");
        dogumYili= input.nextInt();

        switch (dogumYili % 12){
            case 0:
                System.out.println("Cin zodyagi burcunuz : " + "Maymun");
                break;
            case 1:
                System.out.println("Cin zodyagi burcunuz : " + "Horoz");
                break;
            case 2:
                System.out.println("Cin zodyagi burcunuz : " + "Kopek");
                break;
            case 3:
                System.out.println("Cin zodyagi burcunuz : " +"Domuz");
                break;
            case 4:
                System.out.println("Cin zodyagi burcunuz : " +"Fare");
                break;
            case 5:
                System.out.println("Cin zodyagi burcunuz : " +"Okuz");
                break;
            case 6:
                System.out.println("Cin zodyagi burcunuz : " +"Kaplan");
                break;
            case 7:
                System.out.println("Cin zodyagi burcunuz : " +"Tavsan");
                break;
            case 8:
                System.out.println("Cin zodyagi burcunuz : " +"Ejderha");
                break;
            case 9:
                System.out.println("Cin zodyagi burcunuz : " +"Yilan");
                break;
            case 10:
                System.out.println("Cin zodyagi burcunuz : " +"At");
                break;
            case 11:
                System.out.println("Cin zodyagi burcunuz : " +"Koyun");
                break;

        }



    }
}
