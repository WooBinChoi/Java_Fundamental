package java_20210503;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Run Configurations => Arguments => Program arguments (값 넣는곳)
		int month = Integer.parseInt(args[0]);
		String season = "";
		switch (month) {
		case 12,1,2: //case에 ,로 여러개 묶는 것도 가능 하지만 중복되는 값이 들어가면 안됨
			season = "겨을";
			break;
		case 3,4,5:
			season = "봄";
			break;
		case 6,7,8:
			season = "여름";
			break;
		case 9,10,11:
			season = "가을";
			break;
		default:
			season = "없는 계절";
		}
		
		System.out.println(month + "월은 " + season + "입니다.");
	}

}
