import core.logging.DatabaseLogger;
import core.logging.EmailLogger;
import core.logging.FileLogger;
import core.logging.abstracts.Logger;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {
    public static void main(String[] args) {

        Logger[] logger1 = {new DatabaseLogger(),new EmailLogger(),new FileLogger()};
        Logger[] logger2= {new FileLogger(),new DatabaseLogger()};
        Logger[] logger3={new EmailLogger()};

        for(Logger logs : logger3/*logger2,logger3*/ ){
            logs.log("test");
        }

    }
}