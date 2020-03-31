/*
   Day 3: Array of different objects

   Today, I will be making an array of different
   objects by using inheritance.
*/
import java.util.Vector;

class array
{
   public static void main(String[] args)
   {
      // Create a vector of employees and
      // add a bunch of employees.
      Vector<Employee> employees = new Vector<>();
      employees.add(new Intern("Justin",5));
      employees.add(new Developer("Dmitri",85000));
      employees.add(new Developer("Samantha",89500));
      employees.add(new Astronaut("Neil",67000));
      employees.add(new Intern("Jasmine",9000));

      // Print the information of each employee
      for(int i = 0; i < employees.size(); i++)
      {
         System.out.println("Name: " + employees.get(i).getName());
         System.out.println("Salary: " + employees.get(i).getSalary());
         System.out.println("Description: " + employees.get(i).getDescription()+"\n");
      }
   }

   // Parent class
   static abstract class Employee
   {
      public Employee(String name, Integer salary)
      {
         this.name = name;
         this.salary = salary;
      }
      public String getName(){ return name; }
      public Integer getSalary(){ return salary; }
      abstract String getDescription();

      protected String name;
      protected Integer salary;
   }

   // Child class 1
   static class Intern extends Employee
   {
      public Intern(String name, Integer salary){ super(name,salary); }
      public String getDescription(){ return "I am an intern"; }
   }

   // Child class 2
   static class Developer extends Employee
   {
      public Developer(String name, Integer salary){ super(name,salary); }
      public String getDescription(){ return "I am a developer"; }
   }

   // Child class 3
   static class Astronaut extends Employee
   {
      public Astronaut(String name, Integer salary){ super(name,salary); }
      public String getDescription(){ return "I am a legend"; }
   }
}
