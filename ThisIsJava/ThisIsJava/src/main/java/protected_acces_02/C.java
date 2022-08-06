package protected_acces_02;

import protected_acces_01.A;

public class C {
	public void method() {
		A a = new A();		//(x)
		a.field = "value";	//(x)
		a.method();			//(x)
	}
}
