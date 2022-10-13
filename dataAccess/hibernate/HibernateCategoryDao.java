package dataAccess.hibernate;

import dataAccess.abstracts.CategoryDao;
import entities.Category;
import entities.Instructor;

import java.util.ArrayList;

public class HibernateCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {
        categoryList.add(category);
        System.out.println(category.getCategoryName() + " Added to DB via Hibernate ");
    }

    @Override
    public ArrayList<Category> getCategories() {
        return categoryList;
    }

    @Override
    public boolean isExist(int id,String categoryName) {
        if (!categoryList.isEmpty()) {
            for (Category category : categoryList) {
                if (category.getId() == id || category.getCategoryName().toLowerCase().equals(categoryName.toLowerCase())) {
                    return true;
                }
            }
        }
        return false;
    }
}
