package java_20210430;

public class CalendarDemo {
	public static void main(String[] args) {
		/*
		 * 달력 만들기 1. 1년 1월 1일은 월요일 2. 1년은 365일 이고 윤년은 366일 - 2월 29일 3. 윤년은 4년마다 발생하고 그
		 * 중에서 100배수는 제외하고 400배수는 제외하지 않는다. 4. 2021년 4월 30일은 무슨 요일? 힌트) 2020년 까지 총 일수,
		 * 1~3월까지 총 일 수, 30을 더해서 7로 나눈 나머지가 1이면 월요일, 2이면 화요일, ...
		 */

		int year = 2021;
		int month = 4;
		int day = 30;

		int a = (year-1) * 365 
				+ (year-1) / 4 
				- (year-1) / 100 
				+ (year-1) / 400 
				+ (31 + 28 + 31 + day);
		int rest = a % 7;

		if (rest == 1) {
			System.out.println("2021년 4월 30일은 월요일");
		} else if (rest == 2) {
			System.out.println("2021년 4월 30일은 화요일");
		} else if (rest == 3) {
			System.out.println("2021년 4월 30일은 수요일");
		} else if (rest == 4) {
			System.out.println("2021년 4월 30일은 목요일");
		} else if (rest == 5) {
			System.out.println("2021년 4월 30일은 금요일");
		} else if (rest == 6) {
			System.out.println("2021년 4월 30일은 토요일");
		} else {
			System.out.println("2021년 4월 30일은 일요일");
		}
	}
}
