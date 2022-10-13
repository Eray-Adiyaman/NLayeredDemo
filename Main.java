import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.abstracts.Logger;
import dataAccess.hibernate.HibernateCategoryDao;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.hibernate.HibernateInstructorDao;
import dataAccess.jdbc.JdbcCategoryDao;
import dataAccess.jdbc.JdbcCourseDao;
import dataAccess.jdbc.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

        /*LOGGER OBJECTS */
        Logger[] loggers = {new DatabaseLogger(),new EmailLogger()};
        Logger[] loggers1 = {new FileLogger()};

        /* INSTRUCTOR OBJECTS*/
        Instructor instructor = new Instructor(1,"eray");
        Instructor instructor2 = new Instructor(2,"eray2");
        Instructor instructor3 = new Instructor(3,"eray3");

        /*COURSE OBJECTS */
        Course course = new Course(1,"JAVA 2022",0.1,instructor);
        Course course1 = new Course(2,"React",20.0,instructor2);
/*
        Course course2 = new Course(3,"JAVA 2022",20,instructor);
*/

        /*CATEGORY OBJECTS */
        Category category = new Category(1,"JAVA");
        Category category1 = new Category(2,"REACT");
/*
        Category category2 = new Category(3,"java");
*/

        /* MANAGERS */
        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor);
        System.out.println("---------------------------------------------------------------");
        instructorManager.add(instructor2);
        System.out.println("---------------------------------------------------------------");
        InstructorManager instructorManager2 = new InstructorManager(new JdbcInstructorDao(),loggers1);
        instructorManager2.add(instructor3);
        System.out.println("---------------------------------------------------------------");

       /* for(Instructor instructor1 : instructorManager2.getInstructors()){
            System.out.println(instructor1.getInstructorName());
        }*/

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers1);
        courseManager.add(course);
        /*courseManager.add(course2);*/
        System.out.println("---------------------------------------------------------------");


        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(),loggers1);
        categoryManager.add(category);
/*
        categoryManager.add(category2);
*/
    }
}