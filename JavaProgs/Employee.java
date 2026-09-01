
import java.util.Scanner;
class Employee
{
    private String employeeName;
    private String department;
    private String designation;
    private String email;
    private long employeeId;
    private double salary;

    Employee()
    {
        System.out.println("A new default object is created");
    }

    Employee(Employee other)
    {
        System.out.println("A new copy object is created");
        this.employeeName=other.employeeName;
        this.employeeId=other.employeeId;
        email=other.email;
        designation=other.designation;
        salary=other.salary;
        department=other.department;

    }

    Employee(long employeeId,String employeeName,String department,String designation,String email,double salary)
    {
        System.out.println("A new employee object is created with values");
        this.employeeName=employeeName;
        this.employeeId=employeeId;
        this.email=email;
        this.designation=designation;
        this.salary=salary;
       this.department=department;
  }
    void getData(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Employee Name ");
        employeeName = s.nextLine();
        System.out.println("Enter Department ");
        department = s.nextLine();
        System.out.println("Enter Designation ");
        designation = s.nextLine();
        System.out.println("Enter Email ");
        email = s.nextLine();
        System.out.println("Enter Employee Id ");
        employeeId = s.nextLong();
        System.out.println("Enter Salary ");
        salary = s.nextDouble();

   }

      public  String getEmployeeName()
      {
        return employeeName;

      }
      public String getDepartment()
      {
        return department;
      }
      public String getDesignation()
      {
        return designation;
      }
      public String getEmail()
      {
    return email;
      }
    public long getEmployeeId()
    {
        return employeeId;
    }
    public double getSalary()
    {
        return salary;
    }

public void setEmployeeName(String employeeName)
{
    this.employeeName = employeeName;
}
public void setDepartment(String department)
{
    this.department = department;

}
public void setDesignation(String designation)
{
    this.designation = designation;
}
public void setEmail(String email)
{
    this.email = email;
}
public void setEmployeeId(long employeeId)
{
    this.employeeId= employeeId;
}
public void setSalary(double salary)
{
    this.salary = salary;
}




     String toString()
     {
        return "\nEmployee Id : "+employeeId+"\nEmployee Name : "+employeeName+"\nDesignation: "+designation+"\nDepartment : "+department+"\nSalary : "+salary+"\nEmail : "+email;
     }


}