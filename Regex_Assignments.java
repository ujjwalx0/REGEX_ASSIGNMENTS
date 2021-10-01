package Assignments_Regex;
import java.util.Scanner;

public class Regex_Assignments {

	public static void main(String[] args) {
		int sub1, sub2,sub3,sub4,sub5,sub6, total_marks;
		float avg;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Name of the Student:"); 
		String S_name = sc.nextLine();
		System.out.println(" Enter Student Id:");
		String Student_Id = sc.nextLine();
		System.out.println(" Enter marks in Sub1:");
		sub1 = sc.nextInt();
		System.out.println(" Enter marks in Sub2:");
		sub2 = sc.nextInt();
		System.out.println(" Enter marks in Sub3:");
		sub3 = sc.nextInt();
		System.out.println(" Enter marks in Sub4:");
		sub4 = sc.nextInt();
		System.out.println(" Enter marks in Sub5:");
		sub5 = sc.nextInt();
		System.out.println(" Enter marks in Sub6:");
		sub6 = sc.nextInt();
		
		total_marks= sub1+sub2+sub3+sub4+sub5+sub6;
		avg= total_marks/6;
		System.out.println("Student Name :"+S_name+"\n"+"Student Id :"+Student_Id+ " \n" + "Total marks Out of 600:" +total_marks+"\n"+"average"+avg+""+"%");
        sc.close();
	}

}
