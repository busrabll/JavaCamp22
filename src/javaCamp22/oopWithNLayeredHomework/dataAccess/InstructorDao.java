package javaCamp22.oopWithNLayeredHomework.dataAccess;

import javaCamp22.oopWithNLayeredHomework.entities.Instructor;

public interface InstructorDao {

	void add(Instructor instructor);

	void update(Instructor instructor);

	void delete(Instructor instructor);
}
