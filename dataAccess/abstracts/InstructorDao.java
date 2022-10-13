package dataAccess.abstracts;

import entities.Instructor;

import java.util.ArrayList;

public interface InstructorDao {

    ArrayList<Instructor> instructorsList = new ArrayList<>();

    void add(Instructor instructor);

     ArrayList<Instructor> getInstructors();

     boolean isExist(int id);


}
