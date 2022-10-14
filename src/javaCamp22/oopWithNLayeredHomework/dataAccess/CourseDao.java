package javaCamp22.oopWithNLayeredHomework.dataAccess;

import javaCamp22.oopWithNLayeredHomework.entities.Course;

public interface CourseDao {

	void add(Course course);

	void update(Course course);

	void delete(Course course);
}
