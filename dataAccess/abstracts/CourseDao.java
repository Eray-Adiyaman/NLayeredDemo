package dataAccess.abstracts;

import entities.Course;

import java.util.ArrayList;

public interface CourseDao {

    public static ArrayList<Course> courseList = new ArrayList<>();
    public void add(Course course);
    public ArrayList<Course> getCourses();
    public boolean isExist(String courseName);

}
