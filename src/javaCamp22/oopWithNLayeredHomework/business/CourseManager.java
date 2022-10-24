package javaCamp22.oopWithNLayeredHomework.business;

import java.util.ArrayList;
import java.util.List;

import javaCamp22.oopWithNLayeredHomework.core.logging.Logger;
import javaCamp22.oopWithNLayeredHomework.dataAccess.CourseDao;
import javaCamp22.oopWithNLayeredHomework.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<Course> courses = new ArrayList<>();

	public CourseManager(CourseDao courseDao, Logger[] loggers, List<Course> courses) {
		this.courseDao = courseDao;
		this.loggers = loggers;
		this.courses = courses;
	}

	public void add(Course course) throws Exception {

		if (course.getPrice() <= 0) {
			throw new Exception("Course price cannot be less than 0");
		}
		
		for (Course myCourse : courses) {

			if (myCourse.getName().equals(course.getName())) {
				throw new Exception("Course names cannot be the same.");
			}
		}

		courses.add(course);
		courseDao.add(course);

		for (Logger logger : loggers) {
			logger.log(course.getName());
		}
	}

	public void update(Course course) {
		courseDao.update(course);
	}

	public void delete(Course course) {
		courseDao.delete(course);
	}
}
