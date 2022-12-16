import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import lombok.Getter;


public class Student {

	int id;
	String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
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


	


	public static void main(String[] args) {
		
		Student student1= new Student(1, "A");
		Student student2= new Student(1, "A");
		
		System.out.println(student1.equals(student2)+"\n1 hashcode= "+student1.hashCode()+"\n2nd hashcode "+student2.hashCode());
		
		
		
		
	}
}
