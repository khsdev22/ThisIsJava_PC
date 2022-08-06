package protected_acces_02;

import protected_acces_01.A;

public class D extends A{
	public D() {
		super();				//(o)
		this.field = "value";	//(o)
		this.method();			//(o)
	}
}
