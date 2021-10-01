import java.util.Scanner;
public class Employee_salary_calculation {

	public static void main(String[] args) {
		int  HRA , PF, TA , ESI, Gross_Pay ,Net_Pay, Basic_Salary;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter  Name of  Employee :");
		
	    String	emp_Name = sc.nextLine();
	   
	    System.out.println("Enter   Employee Id :");
		
	    String	emp_Id = sc.nextLine();
	   
	    System.out.println("Enter  Basic Salary of  Employee :");
		
	   	Basic_Salary = sc.nextInt();
	   	
	   	
	   	HRA= (int) (Basic_Salary *0.02);
	   	PF=  (int) (Basic_Salary *0.03);
	   	TA= (int) (Basic_Salary *0.01);
	   	ESI = (int) (Basic_Salary *0.025);
	   	Gross_Pay= HRA+PF+TA+ESI+Basic_Salary;
	   	Net_Pay= (Gross_Pay - PF);
	   	
	   	System.out.println("Employee ID: "+emp_Id+"\n"+"Employee Name:"+emp_Name +"\n"+"Basic Salary:"+Basic_Salary+"\n"+"HRA:"+HRA+"\n"+"PF:"+PF+"\n"+"ESI:"+ESI+"\n"+"TA:"+TA+"\n"
	   			+"Gross Pay:"+ Gross_Pay+"\n"+"Net Pay:"+Net_Pay);

	}

}


