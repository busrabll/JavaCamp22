package javaCamp22.oopWithNLayeredHomework.dataAccess;

import javaCamp22.oopWithNLayeredHomework.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Add with jdbc.");
	}

	@Override
	public void update(Course course) {
		System.out.println("Update with jdbc.");
	}

	@Override
	public void delete(Course course) {
		System.out.println("Delete with jdbc.");
	}
}
