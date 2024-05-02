package classprograms;
import java.util.*;

class Employee 
{
    String name;
    String jobTitle;
    int salary;
    public Employee(String name, String jobTitle, int salary) 
    {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }
    public int calculateAnnualSalary() 
    {
        return salary * 12;
    }
    public void updateSalary(int newSalary)
    {
        this.salary = newSalary;
    } 
}
public class CalculateUpdateSalary {
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner e = new Scanner(System.in);
        System.out.println("Enter employee details:");
        System.out.print("Name: ");
        String name = e.nextLine();
        System.out.print("Job Title: ");
        String jobTitle = e.nextLine();
        System.out.print("Monthly Salary: ");
        int salary = e.nextInt();
        Employee employee = new Employee(name, jobTitle, salary);

        System.out.println("\n\nEmployee Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Job Title: " + employee.jobTitle);
        System.out.println("Monthly Salary: " + employee.salary);
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());

        System.out.print("\nEnter the new monthly salary: ");
        int newSalary = e.nextInt();
        employee.updateSalary(newSalary);

        System.out.println("\n\nUpdated Details:");
        System.out.println("Name: " + employee.name);
        System.out.println("Job Title: " + employee.jobTitle);
        System.out.println("Monthly Salary: " + employee.salary);
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());
	}

}
