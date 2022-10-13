package dataAccess.abstracts;

import entities.Category;

import java.util.ArrayList;

public interface CategoryDao {

    ArrayList<Category> categoryList = new ArrayList<>();
     void add(Category category);
     ArrayList<Category> getCategories();
     boolean isExist(int id,String categoryName);

}
