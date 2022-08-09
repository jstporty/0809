/*
 * 6. interface의 주소는 해당 인터페이스의 재정의된 메소드만 접근가능하다.
 * 7.  interface배열에는 해당 인터페이스의 자식 클래스를 넣을 수 있다.
 */

import java.security.DomainCombiner;

public class InterfaceDemo1 extends Object implements Father, Mother {

	@Override
	public void grandFather() {
		System.out.println("called by grandFather");
	}

	@Override
	public void grandMother() {
		System.out.println("called by grandMother");
	}

	@Override
	public void mother() {
		System.out.println("called by Mother");
	}

	@Override
	public void father() {
		System.out.println("called by Father");
	}

	public static void main(String[] args) {
		//GrandFather gFather = new InterfaceDemo1(); gFather.grandFather();
		//Father Father = new InterfaceDemo1(); Father.grandFather();   Father.grandMother(); Father.father();
		Mother[]array=new Mother[3];
		array[0]=new InterfaceDemo1();
		array[0].mother();
	
		System.out.println("Father's MAX="+Father.MAX);
		System.out.println("Mother's MAX="+Mother.MAX);
		
		
	}
}
