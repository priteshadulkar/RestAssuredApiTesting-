package COM.PAGES;

public class abc2 extends abc{

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("abc2 mathod called");
	}
	public static void main(String[] args)
   {
		abc2 ab = new abc2();
		ab.m1();
		ab.m2();
	}
}
////we can not declare private constructor