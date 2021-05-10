package java_20210503;

public class ContinueDemo {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if(i==6) continue;
			sum +=i;
			
			/* 위랑 동일한 코딩
			if(i!=6) {
			sum+=i;
			}
			*/
			
		}
		System.out.println("합은 : " +sum);
	}

}
