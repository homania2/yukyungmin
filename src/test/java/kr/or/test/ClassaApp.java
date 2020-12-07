package kr.or.test;

public class ClassaApp {

	public static void main(String[] args) {
		// 이 클래스의 진입 매서드
		Circle c = new Circle(5);//인스턴스(오브젝트 클래스)변수 c 생성 new키워드 생성자circle(반지름값5)
		//위에서 new 키워드는 메모리에 프로그램 실행공간을 새로 할당한다는 의미
		Circle c2 = new Circle(10);
		//Circle클래스를 c 이름으로 prefix(대충줄임말이라고생각) 해서 사용하는 겁니다.
		//자바프로그램의 특징의 OOP프로그래밍의 대표적인 사례, Object=new키워드로 생성한 c 오브젝트
		//자바에서 OOP 사용방식을 설명하는 예, 스프링에서는 new키워드대신 @Inject 주로 사용.
		double print_result = c.getArea();
		//System.out.println("원의 넓이는" + print_result + "입니다.");
		double print_result2 = c2.getArea();
		//System.out.println("원의 넓이는" + print_result2 + "입니다.");
		
		//아래 new 키워드 생성자를 이용하여 오브젝트를 2개 만듦
		Employee employee = new Employee();
		Salesman salesman = new Salesman();
		Development development = new Development();
		//employee.doJop();
		//salesman.doJop();
		//development.doJop();
		GraphicObject graphicObject = new Triangle();
		graphicObject.draw();
	}

}


//매서드 오버라이드(매서드이름이 같은 것을 실행-상속관계) 와 
//매서드 오버로드(매서드이름은 고유값이라서 중복해서 사용할 수 없어요, 단, 매개변수(인자값)가 다르면 가능합니다.
//추상클래스에 대한 연습(아래)
//추상클래스 또는 인터페이스를 사용하는 목적은 두꺼운 책에서 목차를 만드는 것과 똑같은 역할.
abstract class GraphicObject {
	int x, y;//그래픽오브젝트 클래스 멤버변수 선언
	abstract void draw();//명세만 있는 구현내용이 없는(인터페이스) 추상매서드 선언
	
	//다른 해석하면, 책에서 목차만 있고, 내용이 없는 구조. 내용은 별도의 클래스에 있음.
}
class Triangle extends GraphicObject {
	//매서드 오버라드(매서드이름이 같은 것을 상속관계에서 실행) = 매서드 재정의, 대표적인 다형성을 구현한다.
	@Override//매서드 재정의
	void draw() {
		System.out.println("  *");
		System.out.println(" * * ");
		System.out.println("*****");
	}
	
}

//클래스 상속에 대한연습
class Employee {//회사의 모든직원들 클래스
	int nSalary;//회사직원 봉급 멤버변수
	String szDept;//회사직원의 부서명
	public void doJop() {
		System.out.println("환영합니다. 직원분들!");
	}
}
class Salesman extends Employee {
	public Salesman() {//클래스명과 똑같은 매서드를 생성자 매서드라고한다
		szDept="판매 부서";//부모클래스 Employee의 szDept라는 멤버변수를 자식클래스에서도 사용할수있다.
	}
	public void doJop() {
		System.out.println("환영합니다." + szDept + "입니다.");
	}
}
class Development extends Employee {
	public Development() {
		szDept="개발 부서";
		}
	public void doJop() {
		System.out.println("환영합니다." + szDept + "입니다.!");
	}
}

//오브젝트생성과 new키워드사용 연습
class Circle {
	private int r;//멤버변수
	public Circle(int a) {//생성자매서드
		r = a;
	}
	public double getArea() {
		return r*r*3.14;
	}
}