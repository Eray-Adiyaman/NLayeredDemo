package business;

import core.logging.abstracts.Logger;
import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.ArrayList;

public class CategoryManager {

    private CategoryDao categoryDao;
    private Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        if (!categoryDao.isExist(category.getId(),category.getCategoryName())) {
            categoryDao.add(category);

            for (Logger logs : loggers) {
                logs.log("--> Category  : " + "- " + category.getCategoryName() + " added ");
            }
        } else {
            throw new Exception("This Category already exists --" + " " + category.getId() + " " + category.getCategoryName());
        }

    }

    public ArrayList<Category> getCategories() {
        return categoryDao.getCategories();
    }


}
