/*
   Day 3: Array of different objects

   Today, I will be making an array of different
   objects by using inheritance.
*/
#include <iostream>
#include <vector>
#include <string.h>
using namespace std;

// Parent class
class Employee
{
  public:
     Employee(string name, int salary)
     {
        this->name = name;
        this->salary = salary;
     }
     string getName(){ return name; }
     int getSalary(){ return salary; }

     // Job description is abstract
     virtual string getDescription()=0;
  protected:
     // Has a name and salary
     string name;
     int salary;
};

// Child class 1
class Intern : public Employee
{
   public:
      Intern(string name, int salary) : Employee{name,salary}{}
      string getDescription(){ return "I am an intern"; }
};

// Child class 2
class Developer : public Employee
{
   public:
      Developer(string name, int salary) : Employee{name,salary}{}
      string getDescription(){ return "I am a developer"; }
};

// Child class 3
class Astronaut : public Employee
{
   public:
      Astronaut(string name, int salary) : Employee{name,salary}{}
      string getDescription(){ return "I am a legend"; }
};


int main()
{
   // Create a vector of employees and
   // add a bunch of employees.
   vector<Employee*> employees;
   employees.push_back(new Intern("Justin",5));
   employees.push_back(new Developer("Dmitri",85000));
   employees.push_back(new Developer("Samantha",89500));
   employees.push_back(new Astronaut("Neil",67000));
   employees.push_back(new Intern("Jasmine",9000));

   // Print the information of each employee
   for(int i = 0; i < employees.size(); i++)
   {
      cout << "Name: " << employees[i]->getName() << endl;
      cout << "Salary: " << employees[i]->getSalary() << endl;
      cout << "Description: " << employees[i]->getDescription() << endl << endl;
   }

   return 0;
}
