import java.io.File;
import java.io.FileInputStream;

public class Ex1205 {

	public static void main(String[] args) {
		File file = new File("multiplication.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileInputStream fis = new FileInputStream(file);
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			
			fis.close();
			System.out.println("파일 읽기에 성공했습니다!");
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}