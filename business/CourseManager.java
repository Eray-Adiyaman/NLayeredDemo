package business;

import core.logging.abstracts.Logger;
import dataAccess.abstracts.CourseDao;
import entities.Course;

import java.util.ArrayList;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {
        if (!courseDao.isExist(course.getCourseName())) {
            if(course.getCoursePrice() <=0){
                throw new Exception("Course Price can't be below or equal to 0");
            }

            courseDao.add(course);

            for (Logger logs : loggers) {
                logs.log("--> Course : " + "- "+ course.getCourseName() + " added ");
            }
        } else {
            throw new Exception("This Course already exists -->" + " " + course.getCourseName());
        }

    }

    public ArrayList<Course> getCourses() {
        return courseDao.getCourses();
    }


}
