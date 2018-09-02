package javaPractice;

public class ClassesObjects {

	public static void main(String[] args) {

		ClassesObjects1 st = new ClassesObjects1(); // instance of Student class

		st.setId(007);
		st.setName("Harun");
		st.setAge(37);

		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getName() + "'s student ID is " + st.getId() + " & age is " + st.getAge());

		st.setId(1);
		st.setName("Nafisa");
		st.setAge(11);

		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getName() + "'s student ID is " + st.getId() + " & age is " + st.getAge());

		/*
		 * st.id = 011; st.name = "Samiyah"; st.age = 41;
		 * 
		 * System.out.println(st.id); System.out.println(st.name);
		 * System.out.println(st.name + "'s student ID is " + st.id + " & age is " +
		 * st.age);
		 */
	}
}