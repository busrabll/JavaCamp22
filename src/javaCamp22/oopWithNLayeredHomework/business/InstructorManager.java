package javaCamp22.oopWithNLayeredHomework.business;

import javaCamp22.oopWithNLayeredHomework.core.logging.Logger;
import javaCamp22.oopWithNLayeredHomework.dataAccess.InstructorDao;
import javaCamp22.oopWithNLayeredHomework.entities.Instructor;

public class InstructorManager {

	InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);

		for (Logger logger : loggers) {
			logger.log(instructor.getFirstName());
		}
	}

	public void update(Instructor instructor) {
		instructorDao.update(instructor);
	}

	public void delete(Instructor instructor) {
		instructorDao.delete(instructor);
	}
}
