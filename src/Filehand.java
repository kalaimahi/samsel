import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Filehand {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Folderjava1\\Selenium1\\sundayclass1.txt");
		String f1 = f.getAbsolutePath();
		System.out.println(f1);
		File f11 = new File("C:\\");
		File [] allfiles = f11.listFiles();
		for (File f3 : allfiles) {
			System.out.println(f3);
		}
	}

}
