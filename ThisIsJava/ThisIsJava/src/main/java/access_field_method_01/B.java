package access_field_method_01;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
//		a.field3 = 1;
		
		a.method1();
		a.method2();
//		a.method3();
	}

}
