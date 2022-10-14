package javaCamp22.oopWithNLayeredHomework.dataAccess;

import javaCamp22.oopWithNLayeredHomework.entities.Category;

public interface CategoryDao {

	void add(Category category);

	void update(Category category);

	void delete(Category category);
}
