package java_20210507;

public class StaticMethodDemo {
	 String name;
	static double interestRate;
	public void m1() {
		System.out.println("instance method m1() 호출");	
	}
	public void m2() {
		//instance method에서는
		//모든 변수를 사용하고, 모든 메서드를 호출할 수 있음
		this.name = "최우빈";//this. =>자기자신 인스턴스
		StaticMethodDemo.interestRate = 3.4;//static method는 클래스 이름이 생략되어 있음
		this.m1(); //인스턴스 관련된 것들은 this가 생략되어 있음
		m3();
	}
	public static void m3() {
		System.out.println("Static method m3() 호출");
	}
	public static void m4() {
		//static method에서는 static 변수와 static 메서드만 
		//name = "홍길동";
		interestRate = 4.3;
		//m1();
		m3();
	}
	
	public static void main(String[] args) {
		m3();
		m4();
		interestRate = 4.3;
		StaticMethodDemo smd = new StaticMethodDemo();
		smd.name = "최우빈";
		smd.m1();
		smd.m2();
		
	}
}
