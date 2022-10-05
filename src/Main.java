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

        //value
        int sayi1 =10;
        int sayi2 =20;
        sayi2=sayi1;
        sayi1=30;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2=sayilar1;
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);

        DortIslem dortIslem = new DortIslem();

        int sonuc = dortIslem.Topla(3,4);
        System.out.println(sonuc);

        Product product2 = new Product(1,"bilgisayar","masaüstü bilgisayar",10000.0,5,"kırmızı");
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Asus Laptop");
        product.setPrice(5000);
        product.setStockAmount(3);
        System.out.println(product.getKod());

        ProductManager productManager = new ProductManager();
        productManager.Add(product);


        Customer customer = new Customer();
        Employee employee = new Employee();





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