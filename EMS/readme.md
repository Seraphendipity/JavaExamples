# EMS: Employee Management System

## Assignment
The goal of this assignment is to create a hospital employee tracking system for the UAB hospitals. You will create a Java project to automate the adding, deleting and displaying the list of UAB hospital employees. The set of classes define these employees of a hospital; hospital employee, doctor, nurse, administrator, surgeon, receptionist, and janitor. Your code initially will read a list from txt file (uabEmployee.txt) create the corresponding objects. You will store the objects in java arrays and when you terminate the program you will save the updated list of the employees into same txt file.

* You must use inheritance in creating those classes (Penalty = 20 points) 
* You can use arrays to store objects of the same Class, you can assume maximum size = 10 or one array to store all objects of all the Classes, you can assume maximum size = 50. 
* When you start the program, you will read the [`uabEmployee.txt`](resources/uabEmployee.txt) file line by line. Each line will be containing information for one specific object. You will create these objects and store them in your object array (program memory) 
* You need to display a menu with the following options:
  * **C**REATE: Add employee
    * Admin|Administrator
    * Doctor
    * Nurse
    * Surgeon
    * Receptionist
    * Janitor
  * **R**EAD: Display the employee list
  * **U**PDATE: Update the database 
  * **D**ELETE:Delete employee based on role and blazerID
* Use the Constructors to automatically initialize the instance variables (they should be all declared as private, Penalty = 20 points) 
* Create the appropriate accessor and mutator methods for each private instance variables (setters/getters) 
* Add (overwrite) the methods to display, use `toString()` method and `super()` for printing the employee list. 
* You will create the necessary attributes and methods for each class (check the sample input and output to decide the methods and attributes).

## Example IO
`sampleUabEmplyee.txt`:
> E Lucy 1995
D John 1187 Gastro
N Julia 1254 4
A Jacob 4123 Business
A Catherine 4125 Management
R Alice 4101 Talking Y
J David 4789 Maintenance N
D Samuel 4891 Radiology
S Steve 4345 Brain Y

Sample Ouput:

> ********************************** Welcome to the UAB Employee System *********************************

> The UAB Hospital System has the following employees: 
 
> Total Number of employees = 9 
 
> Hospital Employees: 1
> Name: Lucy   BlazerId: 1995 
 
> Doctors: 2
> Name: John BlazerId: 1187 Specialty: Gastro 
> Name: Samuel BlazerId: 4891 Specialty: Radiology 
 
> Surgeons: 1 
> Name: Steve BlazerId: 4345 Specialty: Brain Operating: Y 
 
> Nurses: 1 
> Name: Julia BlazerId:1254 Number of Patients: 4 
 
> Administrators: 2 
> Name: Jacob BlazerId: 4123 Department: Business 
> Name: Catherine BlazerId: 4125 Department: Management 
 
> Receptionist: 1 
> Name: Alice BlazerId: 4101 Department: Talking Answering: Y 
 
> Janitors: 1 
> Name: David BlazerId 4789 Department: Maintenance Sweeping: N 
 
> ****************************************************************** 

## Design Decisions

### Inheritance: Theme or IO Based?

## Suggestions
* `.csv` with commas instead of the current space system

## Contributors

| NAME | CONTACT | ROLE |
| - | - | - |
| Elijah T. Rose | elirose@uab.edu | Author, Developer |
| Dr. Unan | unan@uab.edu | Instructor, Client |