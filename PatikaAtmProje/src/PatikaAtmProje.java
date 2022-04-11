import java.util.Scanner;


public class PatikaAtmProje {
    public static void main(String[] args) {
        String kAdi,sifre;
        Scanner inp = new Scanner(System.in);
        int secim;
        int kalanHak =3;
        int bakiye =1000;
        int yapilacakİslem;



        while (kalanHak>0){

            System.out.println("Kullanıcı adı girin:");
            kAdi = inp.nextLine();
            System.out.println("Şifre girin :");
            sifre = inp.nextLine();

            if (kAdi.equals("can") && sifre.equals("123")){
                System.out.println("Hoşgeldiniz");
                System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");




                do {

                    System.out.println("1.Para yatırma\n2.Para Çekme\n3.Bakiye Görüntüle\n4.Çıkış");
                    secim = inp.nextInt();
                    switch (secim) {

                        case 1:
                            System.out.println("Para yatırılacak miktarı giriniz: ");
                            yapilacakİslem = inp.nextInt();
                            bakiye+=yapilacakİslem;
                            System.out.println("Toplam tutar: "+ bakiye);
                            break;
                        case 2:
                            System.out.println("Para çekilecek miktar giriniz: ");
                            yapilacakİslem = inp.nextInt();
                            if (yapilacakİslem>bakiye){
                                System.out.println("Bakiye yetersiz.\n Güncel bakiyeniz:"+bakiye);
                            }
                            else {
                                bakiye-=yapilacakİslem;
                                System.out.println("Toplam tutar: "+ bakiye);
                            }

                            break;

                        case 3:

                            System.out.println("Güncel bakiye: "+bakiye);
                            break;


                    }
                }
                while (secim!=4);
                {
                    System.out.println("Çıkış yapılıyor.");
                    break;
                }


            }
            else {

                kalanHak--;
                System.out.println("Şifre hatalı: ");
                System.out.println("Kalan Hakkınız : " + kalanHak);
                if (kalanHak==0){

                    System.out.println("Hesabınız bloke olmuştur lütfen bankanızla iletişime geçiniz.");
                }

            }
        }

    }
}
