package dataAccess.hibernate;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

import java.util.ArrayList;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        instructorsList.add(instructor);
        System.out.println(instructor.getInstructorName() + " Added to DB via Hibernate ");
    }

    @Override
    public ArrayList<Instructor> getInstructors() {
        return instructorsList;
    }

    @Override
    public boolean isExist(int id) {
       if(!instructorsList.isEmpty()){
           for (Instructor instructor : instructorsList){
               if(instructor.getId() == id){
                   return true;
               }
           }
       }
        return false;
    }
}
