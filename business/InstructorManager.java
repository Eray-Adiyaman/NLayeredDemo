package business;

import core.logging.abstracts.Logger;
import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

import java.util.ArrayList;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) throws Exception {
        if(!instructorDao.isExist(instructor.getId())){
            instructorDao.add(instructor);

            for(Logger logs : loggers){
                logs.log("--> Instructor with the name : " + "- " + instructor.getInstructorName() + " added ");
            }

        }else {
            throw new Exception("This instructor already exists --" + " " +  instructor.getId() + " " + instructor.getInstructorName());
        }
    }

    public ArrayList<Instructor> getInstructors(){
        return instructorDao.getInstructors();
    }

}
