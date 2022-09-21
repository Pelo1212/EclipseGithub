
public class MiniProjeler3 {

	public static void main(String[] args) {
		//mükemmel sayı mı?
		
		int number=26;
		int total=0;
	
		
		for(int i=1; i<number; i++){
			if(number % i ==0) {
				total=total+ i;
			}
		}
        if(total==number) {
        	System.out.println("mükemmel sayıdır");
        }
        else {
        	System.out.println("mükemmel sayı değildir.");
        }
        System.out.println("____________________________________________________________");
        //arkadaş sayı
        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;
        
        for(int i=1; i<number; i++) {
        	if(sayi1 % i==0) {
        		toplam1=toplam1+i;
        	}
        }
        for(int i=1; i<number; i++) {
        	if(sayi2 % i==0) {
        		toplam2=toplam2+i;
        	}
        }
        if(sayi1==toplam2 && sayi2==toplam1) {
        	System.out.println("Arkadaş sayılar");
        }
        else {
        	System.out.println("Arkadaş sayı değiller.");
        }
        
        
        System.out.println("____________________________________________________________");
        //sayı var mı kontrol
        int []sayilar=new int[] {1,2,5,7,9,0};
        int aranacak=16;
        boolean varMi=false;
        
        for(int sayi:sayilar) {
        	if(sayi==aranacak) {
        		varMi=true;
        		break;
        	}
        }
        if(varMi) {
        	System.out.println("Sayi mevcuttur.");
        }
        else {
        	System.out.println("Sayi mevcut değildir.");
        }
        
        
        }

}
