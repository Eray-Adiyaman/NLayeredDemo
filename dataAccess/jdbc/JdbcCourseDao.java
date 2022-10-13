package dataAccess.jdbc;

import dataAccess.abstracts.CourseDao;
import entities.Course;

import java.util.ArrayList;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        courseList.add(course);
        System.out.println(course.getCourseName() + " Added to DB via JDBC ");
    }

    @Override
    public ArrayList<Course> getCourses() {
        return courseList;
    }

    @Override
    public boolean isExist(String courseName){
        if (!courseList.isEmpty()){
            for (Course course: courseList){
                if(course.getCourseName().equals(courseName)){
                    return true;
                }
            }
        }
        return false;
    }
}
