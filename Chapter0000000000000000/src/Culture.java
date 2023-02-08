

public abstract class Culture {
	
//	1) Culture 클래스를 정의한다.
//	- 제목, 참여감독 수, 참여배우 수, 관객수, 총점을 필드로 가진다.

	String title;
	int director;
	int actor;
	int audience;
	int total;
	
//	- 제목, 참여감독 수, 참여배우 수는 생성자를 이용하여 값을 초기화한다.
	public Culture(String title, int director, int actor) {
		this.title = title;
		this.director = director;
		this.actor = actor;
	}
	
//	- 메소드는 다음과 같이 정의한다.

//	(1) public void setTotalScore(int score) : 관객수와 총점을 누적시키는 기능    	
	public void setTotalScore(int score) {
		
		// 관객 수 1씩 증가
		audience++;
		
		// 점수를 누적(총점)
		total += score;
	}
	
	//	(2) public String getGrade() : 평점을 구하는 기능
	// 점수 / 관객수 = 평점
	public String getGrade() {
		int avg = total / audience;
		String grade = "";
		// 1. 스위치
//		switch(avg) {
//		case 1:
//			grade = "☆";
//			break;
//		case 2:
//			grade = "☆☆";
//			break;	
//		case 3:
//			grade = "☆☆☆";
//			break;	
//		case 4:
//			grade = "☆☆☆☆";
//			break;
//		case 5:
//			grade = "☆☆☆☆☆";
//			break;
//		}
		
		
		//2. 
		for(int i=0; i<avg; i++) {
			grade += "☆";
		}
		return grade;
		
	}
	
	//	(3) public abstract void getInformation() : 정보를 출력하는 추상메소드
	public abstract void getInformation();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
