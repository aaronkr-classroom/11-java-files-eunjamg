import java.io.File;
import java.io.FileReader;

public class Ex1206 {

	public static void main(String[] args) {
		File file = new File("members.txt");
		
		try {
			if (!file.exists())
				file.createNewFile();
			
			FileReader fr = new FileReader(file);
			int i = 0;
			while((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			
			fr.close();
			System.out.println("파일 읽기에 성공했습니다!");
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}