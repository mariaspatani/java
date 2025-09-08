/*
  Author : Maria
  Date   : Sept 8 2025
  Descripition : FileWriter
 */
import java.io.FileWriter;
import java.io.IOException;
public class FileDemo2 {
	public static void main(String[] args) {
		try {
			FileWriter writer=new FileWriter("poem.txt");
			writer.write("Roses are red lala lala lala");
			writer.append("A poem by Bro");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
