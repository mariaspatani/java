/*
Author: Maria
Date : Sept 4 2025
Description : Different String Methods
*/
public class StringMethods1 {
	public static void main(String[] args) {
		String name="SJCET";
		String name1="   CSE    ";
		boolean result=name.equals("SJCET");//true
			System.out.println(result);
		boolean result1=name.equals("Sjcet");//false (case-sensitive)
			System.out.println(result1);
		boolean result2=name.equalsIgnoreCase("Sjcet");//true
			System.out.println(result2);
		
		int result3=name.length();
		System.out.println(result3);//5
		
		char result4=name.charAt(1);
		System.out.println(result4);//J
		
		int result5=name.indexOf("C");
		System.out.println(result5);//2
		
		boolean result6=name.isEmpty();
		System.out.println(result6);//false
		
		String result7=name.toUpperCase();
		System.out.println(result7);//output:SJCET
		
		String result8=name.toLowerCase();
		System.out.println(result8);//output:sjcet
		
		String result9=name1.trim();//remove all empty spaces
		System.out.println(result9);//output: CSE
		
		String result10=name.replace("JCET", "jcet");//output: Sjcet
		System.out.println(result10);
		
		String result11=name.replace('S', 'V');//output: VJCET
		System.out.println(result11);		
	}
}
