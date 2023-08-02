import java.util.ArrayList;


public class Test {
    public static void main(String[] args){

        Developer dev = new Developer();
        // Instance of Developer in our test
        System.out.println(dev);

        dev.name = "Anakin Skywalker";
        dev.age = 30;
        dev.salary = 120000.23;
        dev.languages.add("Python");
        dev.languages.add("Java");

        Project project1 = new Project();
        project1.title = "Test1";
        project1.language = "Java";

        Project project2 = new Project();
        project2.title = "Test2";
        project2.language = "Other";

        dev.projects.add(project1);
        dev.projects.add(project2);
        

        dev.displayStatus();

        Developer dev1 = new Developer("Anakin", 30, 120000.45 );
        dev1.displayStatus();

    }

}