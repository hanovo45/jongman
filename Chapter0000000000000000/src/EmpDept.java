
public class EmpDept extends Employees{

	//	2) EmpDept 클래스를 정의한다.
	
	//필드
	public String department;
	
	//- Employee 클래스를 상속한다.
	//- 추가로 부서이름을 필드로 가지며 생성자를 이용하여 값을 초기화한다.

	public EmpDept(String name, int salary, String department) {
		
		// 부모 생성자를 통해 부모 객체 생성
		super(name, salary);
		
		// 자식 객체 생성할때 부서이름 초기화
		this.department = department;
	}

	//- 추가된 필드의 getter를 정의한다.
	public String getDepartment() {
		return department;
	}

	//- Employee 클래스의 메소드를 오버라이딩한다.
	
	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println("부서 : " + department);
	}
	
	// public void print()
	@Override
	public void print() {
		super.print();
		System.out.println("서브클래스");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
