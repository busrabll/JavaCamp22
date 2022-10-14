package javaCamp22.oopWithNLayeredHomework.dataAccess;

import javaCamp22.oopWithNLayeredHomework.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Add with hibernate.");
	}

	@Override
	public void update(Course course) {
		System.out.println("Update with hibernate.");
	}

	@Override
	public void delete(Course course) {
		System.out.println("Delete with hibernate.");
	}

}
