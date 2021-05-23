import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class Filehand2 {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Folderpractise\\Fileop\\textfile.txt");
		f.mkdir();
		FileUtils.write(f, "I am going to write two lines about the Fileoperations");
		FileUtils.write(f, " Readlines and write are methods in fileutils class ", true);
		List<String> all = FileUtils.readLines(f);
		for (String s2 : all) {
			System.out.println(s2);
		}
		Boolean b =f.canRead();
		System.out.println(b);
		Boolean b2 =f.canWrite();
		System.out.println(b2);
		Boolean b3 = f.canExecute();
		System.out.println(b3);
		Boolean b4 =f.exists();
		System.out.println(b4);
		Boolean b5 = f.isHidden();
		System.out.println(b5);
		Boolean b6= f.isFile();
		System.out.println(b6);
		Boolean b7 = f.isDirectory();
		System.out.println(b7);
		File f1 = new File("C:\\\\");
		File [] allfile = f1.listFiles();
		for (File f3 : allfile) {
			System.out.println(f3);
		}
		
		
		
	}

}
