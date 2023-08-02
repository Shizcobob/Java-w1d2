import java.util.ArrayList;

public class Developer {
// -----------Attributes --------- (Private/protected)

    // Explictly setting the attribute of developer
    // Should be private and static but for tesing, public
    private boolean canCode = true;
    private String name;
    private int age;
    private double salary;
    private ArrayList<String> languages;
    private ArrayList<Project> projects;
        // Above is a new connncetion!
        //  this is also initailizing the data! above

// Static attribute for the class not the instance
    private static int devCount;
    private static double totalSalary;

// -------------- Constructors ----------- (Method)

// Zero argument constructor - no arguments! Ex, "no name is a default value
    public Developer(){
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        // This will initalize the ArrayList to be used later at anytime and not be null
        this.name = "No Name";
        devCount++;
        Developer.totalSalary += salary;
    }

// Populated contructor!!
    public Developer(String name, int age, double salary){
        this.languages = new ArrayList<String>();
        this.projects = new ArrayList<Project>();
        this.name = name;
        this.age = age;
        this.salary = salary;
        devCount++;

    }

// Other Class Methods ------------

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
// break
    public void addProject(Project project){
        this.projects.add(project);
    }

    public void addLanguage(String language){
        this.languages.add(language);
    }

//  Getters and Setter ----------

// Name Setter
    public void setName(String name){
    this.name = name;
    }
// Name Getter
    public String getName(){
        return this.name;
    }

// CanCode Setter
    public void setCanCode(boolean canCode){
    this.canCode = canCode;
    }
// CanCode Getter
    public boolean getCanCode(){
        return this.canCode;
    }

// Age Setter
    public void setAge(int age){
    this.age = age;
    }
// Age Getter
    public int getAge(){
        return this.age;
    }

// Salary Setter
    public void setSalary(double salary){
    Developer.totalSalary -= this.salary;
    Developer.totalSalary += salary;
    this.salary = salary;
    }
// Salary Getter
    public double getSalary(){
        return this.salary;
    }

// Dev count getter
    public static int getDevCount(){
        return devCount;
    }

// Tot salary getter
    public static double getTotalSalary(){
        return Developer.totalSalary;
    }

}