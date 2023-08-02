import java.util.ArrayList;


public class Test {
    public static void main(String[] args){

        Developer dev = new Developer();
        // Instance of Developer in our test
        System.out.println(dev);

        dev.setName("Anakin Skywalker");
        dev.setAge(30);
        dev.setSalary(120000.23);
        dev.addLanguage("Python");
        dev.addLanguage("Java");

        Project project1 = new Project();
        project1.title = "Test1";
        project1.language = "Java";

        Project project2 = new Project();
        project2.title = "Test2";
        project2.language = "Other";

        dev.addProject(project1);
        dev.addProject(project2);
        
        dev.displayStatus();


        // New developer instance with more populated constructor
        Developer dev1 = new Developer("Darth Vader", 40, 65000.99);
        dev1.displayStatus();

        System.out.println(Developer.getDevCount());
        System.out.println(Developer.getTotalSalary());
        
// End
    }
}