import java.util.Scanner;

public class SwitchEx2 {

	public static void main(String[] args) {
		
		System.out.println("점수를 입력하세요.");
		Scanner scanner =new Scanner(System.in);
		
		Scanner scan;
		int score=scan.nextInt();
		String grade="";
		switch (score/ 10 ) {
		case 9:
			grade="A";
		case 8:
			grade="B";
		case 7:
			grade="c";
		case 6:
			grade="d";
		case 5:
			grade="f";
		}
		System.out.println("학점:"+grade);
		
		
	
	}
}
