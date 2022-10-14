package javaCamp22.oopWithNLayeredHomework.dataAccess;

import javaCamp22.oopWithNLayeredHomework.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Add with jdbc.");
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Update with jdbc.");
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Delete with jdbc.");
	}
}
