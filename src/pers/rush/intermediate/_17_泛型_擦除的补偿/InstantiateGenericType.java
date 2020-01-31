package pers.rush.intermediate._17_泛型_擦除的补偿;

class ClassAsFactory<T>{
	T x;
	public ClassAsFactory(Class<T> kind) {
		try {
			this.x = kind.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
}

class Employee{}

/**
 * 实例化泛型类型
 * @author RUSH
 *
 */
public class InstantiateGenericType {
	public static void main(String[] args) {
		ClassAsFactory<Employee> fe = 
				new ClassAsFactory<Employee>(Employee.class);
		System.out.println("ClassAsFactory<Employee> succeeded");
		ClassAsFactory<Integer> fi = 
				new ClassAsFactory<Integer>(Integer.class);
		// 会报错，原因为：Integer类型没有无参构造器
	}
}
