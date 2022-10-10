package dataAccess.jdbc;

import dataAccess.abstracts.InstructorDao;
import entities.Instructor;

import java.util.ArrayList;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        instructorsList.add(instructor);
        System.out.println(instructor.getInstructorName() + " Added to DB via JDBC ");

    }

    @Override
    public ArrayList<Instructor> getInstructors() {
        return instructorsList;
    }

    @Override
    public boolean isExist(int id) {
        ArrayList<Instructor> instructors = getInstructors();
        if(!instructors.isEmpty()){
            for (Instructor instructor : instructors){
                if(instructor.getId() == id){
                    return true;
                }
            }
        }
        return false;
    }
}
