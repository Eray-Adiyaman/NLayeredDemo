package entities;

public class Course {

    private int id;
    private String courseName;
    private double coursePrice;
    private Instructor instructor;


    public Course(int id, String courseName, double coursePrice, Instructor instructor) {
        this.id = id;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
}
