package javaCamp22.oopWithNLayeredHomework.business;

import java.util.ArrayList;
import java.util.List;

import javaCamp22.oopWithNLayeredHomework.core.logging.Logger;
import javaCamp22.oopWithNLayeredHomework.dataAccess.CategoryDao;
import javaCamp22.oopWithNLayeredHomework.entities.Category;

public class CategoryManager {

	private CategoryDao categoryDao;
	private Logger[] loggers;
	private List<Category> categories = new ArrayList<>();

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers, List<Category> categories) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
		this.categories = categories;
	}

	public void add(Category category) {

		for (Category myCategory : categories) {

			if (myCategory.getName().equals(category.getName())) {

				System.out.println("Category names cannot be the same.");
			}
		}

		categoryDao.add(category);

		for (Logger logger : loggers) {
			logger.log(category.getName());
		}
	}

	public void update(Category category) {
		categoryDao.update(category);
	}

	public void delete(Category category) {
		categoryDao.delete(category);
	}
}
