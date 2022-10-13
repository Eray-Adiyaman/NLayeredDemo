package dataAccess.abstracts;

import entities.Course;

import java.util.ArrayList;

public interface CourseDao {

     ArrayList<Course> courseList = new ArrayList<>();
     void add(Course course);
     ArrayList<Course> getCourses();
     boolean isExist(String courseName);

}
