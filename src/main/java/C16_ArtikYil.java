public class C16_ArtikYil {

    public static void main(String[] args) {



        int artikYil = 1990;

        String sonuc = artikYil % 100 == 0 ? (artikYil % 400 == 0 ? "Artik yil" : "Artik yil degil") : (artikYil % 4 == 0 ? "Artik yil " : "Artik yil degil");


        System.out.println(sonuc);


    }
}
