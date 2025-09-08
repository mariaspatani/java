/*
 Author : Maria
 Date   : Sept 8 2025
 Description : File introduction
 */
import java.io.File;
public class FileDemo {
	public static void main(String[] args){
		//file =An abstract representation of file and directory pathnames
	//creating an object for the file
		File file=new File("FileDemo1.txt");
		//File file =new File("C:\Users\HP\Desktop\FileDemo1.txt");
		if(file.exists()) {
			System.out.println("That file exists!");
		}
		else {
			System.out.println("That doesn't file exists!");
		}
	}
}
