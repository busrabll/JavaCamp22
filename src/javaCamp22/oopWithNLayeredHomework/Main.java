package javaCamp22.oopWithNLayeredHomework;

import java.util.ArrayList;
import java.util.List;

import javaCamp22.oopWithNLayeredHomework.business.CategoryManager;
import javaCamp22.oopWithNLayeredHomework.business.CourseManager;
import javaCamp22.oopWithNLayeredHomework.business.InstructorManager;
import javaCamp22.oopWithNLayeredHomework.core.logging.DatabaseLogger;
import javaCamp22.oopWithNLayeredHomework.core.logging.Logger;
import javaCamp22.oopWithNLayeredHomework.dataAccess.HibernateCategoryDao;
import javaCamp22.oopWithNLayeredHomework.dataAccess.JdbcCourseDao;
import javaCamp22.oopWithNLayeredHomework.dataAccess.JdbcInstructorDao;
import javaCamp22.oopWithNLayeredHomework.entities.Category;
import javaCamp22.oopWithNLayeredHomework.entities.Course;
import javaCamp22.oopWithNLayeredHomework.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {

		Course course1 = new Course(1, "Java Course", 0);
		Logger[] loggers = { new DatabaseLogger() };
		List<Course> courses = new ArrayList<>();
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers, courses);
		courseManager.add(course1);

		Category category1 = new Category(2, "Programming");
		List<Category> categories = new ArrayList<>();
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers, categories);
		categoryManager.add(category1);

		Instructor instructor = new Instructor(3, "Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);
	}
}
