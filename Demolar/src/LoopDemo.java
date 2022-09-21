
public class LoopDemo {

	public static void main(String[] args) {
		
			//for
			for(int i=1;i<=10;i+=2) {
				System.out.println(i);
				
			}
			System.out.println("if Döngüsü  bitti");

   
	     	//while
		   int i=2;        //yukarda if deki "i" if bloğu için geçerli değişken o yüzden tekrar tanımlıyoruz burda
		   while(i<10) {
			i+=2;          // bu artım  koşulunu yazmazsak while döngüsünde sonduz döngüye girer ve hep 2-2-2--2 yazar
			System.out.println(i);
		}
		System.out.println("While döngüsü bittii");
	
	
	      //Do-While döngüsü
	
		int k=100;
	       do{
	    	   
	    	  System.out.println(k);
	    	  k+=2;
	          }
	         while(k<10); //do-while da while en son yazılıyo blok açmadan noktalı virgülle bitir.
	         System.out.println("do-while döngüsü bitti");
	         
	}
}


