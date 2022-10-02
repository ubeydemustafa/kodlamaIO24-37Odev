public class Main {
    public static void main(String[] args) {

        sayiBulmaca();
        System.out.println(topla(5,7));
        System.out.println(kelimeTopla("selam","naber"));
        int toplam = topla2(8,7,4,5,6,9,3,8,5,4,2,7,0,9,4,5);
        System.out.println(toplam);
        System.out.println("\n" + "metodlar, parametreli metodlar ve variable arguments uygulamaları sonu!!!!" + "\n----------------------------------------------------------------------------------------------------------");

        //------------------------------------------------------------------------------------------
        CustomerManager customerManager = new CustomerManager();
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2; //stack and heap için işlenen örnek.
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

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
    public static int topla(int a, int b){
        return a+b;
    }

    public static String kelimeTopla(String a,String b){
        return a+" "+b;
    }
    public static int topla2(int...sayilar){
        int toplam =0;
        for (int sayi:sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }
}