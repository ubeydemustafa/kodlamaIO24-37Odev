public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{1,2,5,7,9,0};
        int aranacak = 5;

        for (int sayi: sayilar){
            if(sayi==aranacak){
                mesajVer("sayı mevcuttur: "+ aranacak);
            }
        }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);

    }
}