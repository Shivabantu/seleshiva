package javaa;
import org.testng.annotations.Test;
public class ps1 extends ps {
	@Test
	public void demoo() {
		demo();
		ps2 pss = new ps2(3);
		int a = 3;
		System.out.println(pss.increment());
		System.out.println(pss.decrement());
		System.out.println(pss.mutiple());
		System.out.println("shiva");
	}

}
