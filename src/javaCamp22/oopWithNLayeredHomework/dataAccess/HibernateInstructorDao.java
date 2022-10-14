package javaCamp22.oopWithNLayeredHomework.dataAccess;

import javaCamp22.oopWithNLayeredHomework.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Add with hibernate.");
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Update with hibernate.");
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Delete with hibernate.");	
	}
}
