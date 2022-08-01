package singleton;

public class Singleton {
	
	private static Singleton singleton = new Singleton(); 
	// 자신의 타입인 정적 필드를 하나 선안하고 자신의 객체를 생성해 초기화한다. 
	// 정적 필드도 private 접근 제한자를 붙여 외부에서 필드값을 변경하지 못하도록 막는다.
	
	private Singleton() {} // 생성자를 외부에서 호출할 수 없도록 생성자 앞에 private 접근 제한자를 붙임
	
	static Singleton getInstance() {
		return singleton;
	}
}
