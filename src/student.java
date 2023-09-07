import java.util.Scanner;

public class student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//	To get input from user		
		Scanner st = new Scanner(System.in);
		
		String fname;
		String lname;
		int age;
		int rollNo;
		
		System.out.println("Enter First Name : ");
		fname = st.nextLine();
		
		System.out.println("Enter Second Name : ");
		lname = st.nextLine();
		
		System.out.println("Enter Age : ");
		age = st.nextInt();
		
		System.out.println("Enter Roll No. : ");
		rollNo = st.nextInt();
		
		main std = new main();
		std.setfname(fname + lname + age + rollNo);
		
		
	}

}