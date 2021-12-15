import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonReflection {

	public static void main(String[] args) throws Exception {
//		Person p1 = new Person("Zubair", 42);
//		System.out.println(p1);
//		
//		Class pc = p1.getClass();
		
		// Loading a Java class manually
		Class pc = Class.forName("Person");
		
		System.out.println(pc.getName());
		
		Constructor[] constructors = pc.getConstructors();
		System.out.println("-- List of constrcutors");
		for (Constructor c : constructors) 
			System.out.println(c);
		
		Method[] methods = pc.getMethods();
		System.out.println("-- List of methods");
		for (Method m : methods) 
			System.out.println(m);
		
		Method[] decMethods = pc.getDeclaredMethods();
		System.out.println("-- List of declared methods");
		for (Method m : decMethods) 
			System.out.println(m);
		
		Field[] fields = pc.getFields();
		System.out.println("-- List of fields");
		for (Field f : fields) 
			System.out.println(f);
		
		Field[] decFields = pc.getDeclaredFields();
		System.out.println("-- List of declared fields");
		for (Field f : decFields) 
			System.out.println(f);
		
		// Dynamically instantiating Person class
		Object obj = constructors[0].newInstance(null);
		System.out.println(obj);
		
		Method print = pc.getMethod("print", null);
		print.invoke(obj, null);
	}
}
