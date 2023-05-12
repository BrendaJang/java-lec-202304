
 public class ifEx2 {

	public static void main(String[] args) {
		
		int score=80;
	    String grade="";
	    
	    System.out.println("학점부여 시작합니다.");
	    if(score>=95 ) {
	    	grade="A";
	    }else if(score>=90 ){
		    grade="B";
	    }else if(score>=85 ) {
			grade="C";
	    }else if(score>=80 ) {
		    grade="D";
	    }else if(score>=75 ) {
			grade="E";
	    }else if(score>=70 ) {
			grade="F";
	    }
	    System.out.println("당신의 학점은 "+grade+" 입니다");
		System.out.println("학점부여 시스템을 종료합니다.");
					    	
	    }
	}
		    	
	    	
