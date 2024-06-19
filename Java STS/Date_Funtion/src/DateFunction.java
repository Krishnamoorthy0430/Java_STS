import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class DateFunction 
{

	public static void main(String[] args) throws ParseException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Date");
		String d = sc.nextLine();
		System.out.println("Given Input for d : "+d);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-mm");
		Date dob = sdf.parse(d);
		System.out.println("Given Input for dob : "+dob);
		sdf = new SimpleDateFormat("EEEE"+" - "+"MMM"+" "+"dd"+" , "+"yyyy");
		SimpleDateFormat dt = new SimpleDateFormat("mm");
		System.out.println("Given Input for sdf.dob : "+sdf.format(dob));
		System.out.println("Given Input for dt : "+dt.format(dob));

	}

}
