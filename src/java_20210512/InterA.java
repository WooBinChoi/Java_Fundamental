package java_20210512;
//인터페이스간의 상속은 extends 키워드를 사용하고, 다중상속이 가능함.
public interface InterA extends InterB, InterC {
	//인터페이스의 변수는 public static final이 생략되어 있음
	public static final double PI = 3.14; //final이 생략되어 있으므로 대문자로 씀
	//인터페이스의 접근 한정자를 붙이지 않으면 public이 생략되어 있음
	//abstract 생략 가능
	public abstract void mA();
}
