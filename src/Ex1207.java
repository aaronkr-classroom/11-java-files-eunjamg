import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

public class Ex1207 {

	public static void main(String[] args) {
		File file = new File("members.txt");
		
		try {
			if (!file.exists())
				file.createNewFile();
			
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			
			fr.close();
			System.out.println("Success to read file!");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}