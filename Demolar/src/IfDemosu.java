
public class IfDemosu {

	public static void main(String[] args) {
		//kolay örnekler ,elimdeki 3 sayıdan en büyüğünü bulma
		
		int sayi1=24;
		int sayi2=25;
		int sayi3=5;
		int enBuyuk=sayi1;
		
		
		if(enBuyuk<sayi2) {
			enBuyuk=sayi2;
		}
        if (enBuyuk<sayi3) {
        	enBuyuk=sayi3;
        }
        System.out.println("EN Buyuk sayı:"+enBuyuk);
	}

}
