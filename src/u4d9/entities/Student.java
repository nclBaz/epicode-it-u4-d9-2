package u4d9.entities;

/**
 * @author ricca
 *
 */
public class Student {
	private String name;
	private String surname;
	private int age;
	private int id;

	public Student(String name, String surname, int age, int id) {

		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {

		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", age=" + age + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		if (this.name == s.name && this.surname == s.surname && this.age == s.age) {
			return true;
		} else {
			return false;
		}
	}


}
