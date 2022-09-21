
public class MiniProjeler {

	public static void main(String[] args) {
		int number=-1;
		int remainder =number%2;
		//System.out.println(remainder);
		
		boolean asalSayı=true;
		//bug olmasın diye iki ifi ekledik. 
		if(number==1) {
			System.out.println("sayı asal değildir");
			return;  //return demezsek aşşağıya inip foru çalıştıracağından bide ek olarak  sayı asaldır yazar.returnla maini kapadık.
		}
		if(number<1) {
			System.out.println("geçersiz sayı");
			return;
		}
		
		for(int i=2; i<number;i++) {
			if(number%i==0) {
				asalSayı=false;
			}
		}
		if(asalSayı) {
			System.out.println("sayı asaldır");
		}
		else {
			System.out.println("sayı asal değilgir");
		}



  
	}

}

