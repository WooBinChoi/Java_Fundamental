package java_20210511;

public class SubDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
		System.out.println(sub.money);
		sub.makeMoney();
		System.out.println(sub.chicken);
		sub.gotoSchool();
		
		sub.play("~~~");
		
		Super sup = new Super();
		System.out.println(sup.money);
		sup.makeMoney();
		sup.play("~~");
		
		Super sup1 = new Sub();
		System.out.println(sup.money);
		sup1.makeMoney();
		sup1.play("~~");
		
		System.out.println(sub);//toString()이 생략되어 있음
		System.out.println(sub.toString()); //toString은 object에 있는 메서드(object에 toString이 있기때문)

		Object obj = new Sub();
		System.out.println(obj);
	}

}
