package dataAccess.hibernate;

import dataAccess.abstracts.CourseDao;
import entities.Course;

import java.util.ArrayList;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        courseList.add(course);
        System.out.println(course.getCourseName() + " Added to DB via Hibernate ");
    }

    @Override
    public ArrayList<Course> getCourses() {
        return courseList;
    }

    @Override
    public boolean isExist(String courseName){
        ArrayList<Course> courses = getCourses();
        if (!courses.isEmpty()){
            for (Course course: courses){
                if(course.getCourseName().equals(courseName)){
                    return true;
                }
            }
        }
        return false;
    }
}
