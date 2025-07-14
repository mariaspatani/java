/*
  Author: Maria
  Date :15 July 2025
  Description: Input a number to convert to its corresponding day using switch case.
 */
import java.util.Scanner;
public class WeekDay {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("Input Number:(1-7)");
		String dayNo=sc.nextLine();
		String DayName= switch(dayNo){
		case"1"->"SUNDAY";
		case "2"->"MONDAY";
		case"3"->"TUESDAY";
		case"4"->"WEDNESDAY";
		case"5"->"THURSDAY";
		case"6"->"FRIDAY";
		case"7"->"SATURDAY";
		default-> "invalid Day";
	};
		System.out.println(DayName);
		sc.close();
		
		
	}

}
