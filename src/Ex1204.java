import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex1204 {

	public static void main(String[] args) {
		
		File file = new File("members.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileWriter fw = new FileWriter(file);
			Scanner input = new Scanner(System.in);
			
			boolean quit = false;
			while(!quit) {
				System.out.print("ID: ");
				String uid = input.next();
				fw.write("ID: " + uid + " ");
				
				System.out.print("NAME: ");
				String name = input.next();
				fw.write("NAME: " + name + "\n");
				
				System.out.println("Continue? [Y] [N] ");
				String str = input.next();
				
				if (str.toUpperCase().equals("N"))
					quit = true;
				
			}
			fw.close();
			System.out.println("Success to write file!");
			
		}
		catch(Exception e) {
			e.getMessage();
		}

	}

}