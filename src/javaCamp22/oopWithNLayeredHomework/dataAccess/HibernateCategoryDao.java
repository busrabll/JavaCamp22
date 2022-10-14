package javaCamp22.oopWithNLayeredHomework.dataAccess;

import javaCamp22.oopWithNLayeredHomework.entities.Category;

public class HibernateCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("Add with hibernate.");
	}

	@Override
	public void update(Category category) {
		System.out.println("Update with hibernate.");	
	}

	@Override
	public void delete(Category category) {
		System.out.println("Delete with hibernate.");	
	}
}
