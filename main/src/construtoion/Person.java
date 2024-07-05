package construtoion;
public class Person {
    // Private fields for name and age
    private String name;
    private int age;
    
    // Constructor that takes name and age parameters
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Method to introduce the person
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
    
    // Getter method for name
    public String getName() {
        return name;
    }
    
    // Getter method for age
    public int getAge() {
        return age;
    }
    
    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    
    // Setter method for age
    public void setAge(int age) {
        this.age = age;
    }
}
