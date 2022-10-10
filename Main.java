import business.CourseManager;
import business.InstructorManager;
import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.abstracts.Logger;
import dataAccess.hibernate.HibernateCourseDao;
import dataAccess.hibernate.HibernateInstructorDao;
import dataAccess.jdbc.JdbcCourseDao;
import dataAccess.jdbc.JdbcInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {

   /*     Logger[] logger1 = {new DatabaseLogger(),new EmailLogger(),new FileLogger()};
        Logger[] logger2= {new FileLogger(),new DatabaseLogger()};
        Logger[] logger3={new EmailLogger()};
        for(Logger logs : logger3*//*logger2,logger3*//* ){
            logs.log("test");
        }
        Instructor instructor = new Instructor(1,"Engin Demirog");
        Course course = new Course(1,"JAVA 2022",0.0,instructor);
        Category category= new Category(1,"Java");


*/
        Logger[] loggers = {new DatabaseLogger(),new EmailLogger()};
        Logger[] loggers1 = {new FileLogger()};
        Instructor instructor = new Instructor(1,"eray");
        Instructor instructor2 = new Instructor(2,"eray2");
        Instructor instructor3 = new Instructor(3,"eray3");
        Course course = new Course(1,"JAVA 2022",0.1,instructor);

        InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(),loggers);
        instructorManager.add(instructor);
        System.out.println("---------------------------------------------------------------");
 /*       instructorManager.add(instructor2);
        System.out.println("---------------------------------------------------------------");
        InstructorManager instructorManager2 = new InstructorManager(new JdbcInstructorDao(),loggers1);
        instructorManager2.add(instructor3);*/


       /* for(Instructor instructor1 : instructorManager2.getInstructors()){
            System.out.println(instructor1.getInstructorName());
        }*/

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(),loggers1);
        courseManager.add(course);


    }
}