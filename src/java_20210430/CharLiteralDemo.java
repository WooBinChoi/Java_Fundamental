package java_20210430;

public class CharLiteralDemo {
	public static void main(String[] args) {
		//char literal => 문자 표현법
		char c1 = '최';
		char c2 = '우';
		char c3 = '빈';
		
		System.out.print(c1);
		System.out.print(c2);
		System.out.println(c3);

		//char literal => 유니코드 표현법
		char c4 = '\ucd5c';
		char c5 = '\uc6b0';
		char c6 = '\ube48';
		
		System.out.print(c4);
		System.out.print(c5);
		System.out.println(c6);
		
		//char literal => 아스키코드 표현법
		char c7 = 48;
		char c8 = 65;
		char c9 = 97;
		
		System.out.println(c7);
		System.out.println(c8);
		System.out.println(c9);
		
		//문자중에 사용할 수 없는 문자는 ' \
		//' \를 사용하기 위해서는 \를 사용
		char c10 = '\'';
		char c11 = '\\';
		
		System.out.println(c10);
		System.out.println(c11);
		
		//특수문자 \t \n
		System.out.print("안녕하세요.\n저는 최우빈입니다.\n잘 부탁드립니다.\n");
		System.out.println("아이디\t이름\t지역");
		System.out.println("abc123\t최우빈\t고양");
		
		
	}

}
