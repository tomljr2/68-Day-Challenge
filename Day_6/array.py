"""
   Day 3: Array of different objects

   Today, I will be making an array of different
   objects by using inheritance.
"""
# Parent class
class Employee:
   def __init__(self,name,salary):
      self._name=name
      self._salary=salary
   def getName(self): return self._name
   def getSalary(self): return self._salary
   def getDescription(self): pass

# Child class 1
class Intern(Employee):
   def __init__(self,name,salary): super().__init__(name,salary)
   def getDescription(self): return "I am an intern"

# Child class 2
class Developer(Employee):
   def __init__(self,name,salary): super().__init__(name,salary)
   def getDescription(self): return "I am a developer"

# Child class 3
class Astronaut(Employee):
   def __init__(self,name,salary): super().__init__(name,salary)
   def getDescription(self): return "I am a legend"


# Technically, Python doesn't have a vector and lists support
# multiple data types already, but lets pretend like this is
# a vector of Employees.
employees = [Intern("Justin",5), Developer("Dmitri",85000), \
             Developer("Samantha",89500), Astronaut("Neil",67000), \
             Intern("Jasmine",9000)]

# Print the information of each employee
for i in range(len(employees)):
   print("Name: " + employees[i].getName())
   print("Salary: " + str(employees[i].getSalary()))
   print("Description: " + employees[i].getDescription()+"\n")
