package dataAccess.jdbc;

import dataAccess.abstracts.CategoryDao;
import entities.Category;

import java.util.ArrayList;

public class JdbcCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        categoryList.add(category);
        System.out.println(category.getCategoryName() + " Added to DB via JDBC ");
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
