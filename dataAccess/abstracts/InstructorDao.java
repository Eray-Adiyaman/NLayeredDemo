package dataAccess.abstracts;

import entities.Instructor;

import java.util.ArrayList;

public interface InstructorDao {

    public static ArrayList<Instructor> instructorsList = new ArrayList<>();

    public void add(Instructor instructor);

    public ArrayList<Instructor> getInstructors();

    public boolean isExist(int id);


}
