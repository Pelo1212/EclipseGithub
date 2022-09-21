
public class StringDemolar {

	public static void main(String[] args) {
		String mesaj="  Bugün hava çok güzel. ";
		System.out.println(mesaj);
		
		System.out.println("elaman sayısı:"+mesaj.length());
		System.out.println("5. eleman:"+mesaj.charAt(4));     //5. elemanı istiyorsam chatAt ın i.ine 4. indis yazılır.
		System.out.println(mesaj.concat("yaşasın!"));
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.startsWith("b"));      //startsWith ve endsWith boolean döndürür.
		System.out.println(mesaj.endsWith("."));
		
		char[]karakterler=new char[5];        //eleman sayısı yazılır
		mesaj.getChars(0, 5, karakterler, 0); /* mesajdan karakter çekiyorom 0 dan başla 5 te bitir karakterker isimli dizime ata, 0dan bşlyrk ata.
		                                     getChars da srcEnd ini 5 yazdık 4. indise kadar ekrana basar.*/
		System.out.println(karakterler);
		
		System.out.println(mesaj.indexOf("av"));    //ifadeyi sağdan tespit eder sağdan indis sayarak basar
		System.out.println(mesaj.lastIndexOf("a")); //ifadeyi sağdan tespit eder soldan indis sayarak basar
		System.out.println("-------------------------------------------------------------------------------");	
		
		String yeniMesaj= mesaj.replace(" ", "-"); //replace değiştirmek,güncelleme gibi düşün.ilk parametre oldChar,2.si newChar.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2,4));// 2den 4 e kadar (4dahil deil)-metni parçalamak için substring.
		System.out.println(mesaj.substring(2,5));
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);	/*split bir metni belli bir karakter dizisini dikkate alarak parçalamaya yarar.
			                              bugün hava çok güzel bir dizi ve 4 karakteri var 
			                              4 karakteri ayrı ayrı almak için spliti kullanıcaz for döngüsüyle
			                              foreache kullanalım*/
	    }
		System.out.println(mesaj.toLowerCase()); //küçük harfe dönüştürür hr şeyi
		System.out.println(mesaj.toUpperCase()); //büyük harfe dönüştürür her şeyi
		System.out.println(mesaj.trim());
	
	}

}
