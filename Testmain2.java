package register;

import java.util.Scanner;

public class Testmain2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the register details");
		String str=scan.nextLine();
		Register reg=new Register(str.split(",")[0],
	            str.split(",")[1],str.split(",")[2]);
		Registerdao regdo=new Registerdao();
		regdo.insert(reg);

	}

}
