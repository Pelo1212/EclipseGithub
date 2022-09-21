
public class SwitchDemosu {

	public static void main(String[] args) {
		
		char grade ='A';
		switch(grade) {
		case 'A':
			System.out.println("mükemmel gecßtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("iyi geçtiniz");
			break;
		case 'F':
			System.out.println("maalesef kaldınız");
			break;
			default:
				System.out.println("Geçersiz Not Girdiniz.");
		}

	}

}
