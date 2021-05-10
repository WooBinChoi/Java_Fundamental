package java_20210503;

public class ForDemo2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			sum += i;
		}
		System.out.printf("1부터 10까지의 합은 %d%n",sum);
		
		sum = 0;
		for (int i = 0; i <= 10; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		
		System.out.printf("1~10 중 짝수의 합은 %d%n", sum);
		
		for (int first = 2; first <= 9; first++) {
			System.out.printf("%d단 입니다.%n", first);
			for (int second = 1; second <= 9; second++) {
				System.out.printf("%d X %d = %d%n", first, second, first*second);
			}
		}
		
		int totalCountOfPrimeNumber = 0;
		int totalIndex = 0;
		
		for (int i = 2; i <= 100; i++) {
			int count = 0;
			for(int j = 2; j<i; j++) {
				if(i%j==0) {
					count++;
					break;
				}
				totalIndex++;
			}
			if(count==0) {
				totalCountOfPrimeNumber++;
				System.out.print(i+"\t");
			}
			totalIndex++;
		}
		System.out.println();
		System.out.println(totalCountOfPrimeNumber);
		System.out.println(totalIndex);
		
	}

}
