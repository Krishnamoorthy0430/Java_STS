import java.util.Scanner;
import java.text.ParseException;

public class App {

	public static void main(String[] args) {
		
		College clg1 = new College();
		System.out.println("Enter College Details of 1 in the order : \n"
				+ "name\n"+"website\nmobile\nfounder\nnumber of departments\nlocation");
		Scanner sc = new Scanner(System.in);
		String col1 = sc.nextLine();
		String []ar = col1.split(",");
		
		clg1.setName(ar[0]);
		clg1.setWebsite(ar[1]);
		clg1.setMobile(ar[2]);
		clg1.setFounder(ar[3]);
		clg1.setNod(Integer.parseInt(ar[4]));
		clg1.setLocation(ar[5]);
		System.out.println();
		System.out.println("College 1:");
		System.out.println(clg1);
		System.out.println();
		System.out.println("College 2:");
		System.out.println(college2);
		
		if(college1.equals(college2))
		{
			System.out.println("College 1 is same as College 2");
		}else
		{
			System.out.println("College 1 and College 2 are different");
		}
	}
		

	}

}
