import java.util.ArrayList;

public class Developer {

    private boolean canCode = true;
    // Explictly setting the attribute of developer
    // Should be private and static but for tesing, public
    private String name;
    private int age;
    private double salary;
    private ArrayList<String> languages;
    // Below is a new connncetion!
    private ArrayList<Project> projects = new ArrayList<Project>();
    //  this is also initailizing the data! above

// Zero argument constructor
// public Developer(){} => usua appereance
  public Developer(){
    this.languages = new ArrayList<String>();
        this.name = "No Name";   
    }


// more populate contrustor below
    public Developer(String name, int age, double salary){
        this.languages = new ArrayList<String>();
        this.name = name;
        this.age = age;
        this.salary = salary;


    }
   


    public void displayStatus(){
        System.out.println("name: " + this.name);
        System.out.println("Can Code: " + this.canCode);
        System.out.println("age: " + this.age);
        System.out.println("salary: " + this.salary);
        System.out.println("languages: " + this.languages);


        System.out.println("Projects: " + this.projects);
        for(Project project: this.projects){
            project.displayInfo();
        }
    }

    
    public void addProject(Project project){
        this.projects.add(project);
    }

    

}