package javaCollectionsAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {
	int age;
	String name;

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "student [age=" + age + ", name=" + name + "]";
	}

	public int compareTo(Student that) {

		if (this.age > that.age) {
			return 1;

		} else {
			return -1;
		}
	}

}

public class comparable {
	public static void main(String[] args) {

		Comparator<Student> c = (Student i, Student j) -> {
			if (i.age > j.age) {
				return 1;

			} else {
				return -1;
			}
		};

		List<Student> stud = new ArrayList<>();
		stud.add(new Student(25, "Prasanth"));
		stud.add(new Student(23, "Bhavi"));
		stud.add(new Student(21, "priya"));
		stud.add(new Student(22, "Anil"));

//		System.out.println(stud);

		Collections.sort(stud, c);

		for (Student s : stud) {
			System.out.println(s);
		}
	}
}
