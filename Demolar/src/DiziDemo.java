
public class DiziDemo {

	public static void main(String[] args) {
		String ogrenci1="Engin";
		String ogrenci2="Derin";
		String ogrenci3="Pelin";
		String ogrenci4="Ahmet";
		
		System.out.println(ogrenci1);
	    System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-------------------------");
		
		String[]ogrenciler=new String[4];
		ogrenciler[0]="Engin";
		ogrenciler[1]="Derin";
		ogrenciler[2]="Pelin";
		ogrenciler[3]="Ahmet";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		System.out.println("-----------------------------");
	
	    for(String ogrenci: ogrenciler) {
	    	System.out.println(ogrenci);
	    }
	    System.out.println("-----------------------------------------------------------------------------------------------");

	    //dizi elemanları ekrana basma-toplama-en büyük elemanı bulma
	    
	    double[]myList= {1.2,6.3,4.3,5.6};
	    double total=0;
	    double max=myList[0];
	    for(double number:myList) {
	    	System.out.println(number);
	    	total=total+number;
	    	if (max<number) {
	    		max=number;
	    	}
	    }
	    System.out.println("toplam:"+total);
	    System.out.println("en büyük:"+max);
}
}