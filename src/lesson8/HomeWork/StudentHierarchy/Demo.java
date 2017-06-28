package lesson8.HomeWork.StudentHierarchy;

public class Demo {

	Student createHighestParent() {

		Course[] coursesTaken = {};

		// Course[] courseTaken = new Course[] {};

		Student student = new Student("Vasja", "Pupkin", 3, coursesTaken);

		return student;

	}

	SpecialStudent createLowestChild() {

		Course[] coursesTaken = {};

		SpecialStudent specialStudent = new SpecialStudent("Bogdan", "Pupko", 4, coursesTaken, 123214534,
				"bpupko@gmail.com");

		return specialStudent;

	}
}
