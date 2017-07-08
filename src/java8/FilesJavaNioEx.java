package java8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesJavaNioEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Path path = Paths.get("C:\\Users\\hemonth.mandava.SSTECH\\Desktop\\status reports");
		Files.list(path).forEach(i -> {
			try {
//				BufferedReader bufferReader = new BufferedReader(new FileReader(i.normalize().toString()));
//				bufferReader.lines().forEach(j -> System.out.println(j));
				//read word documents
//				FileInputStream fis = new FileInputStream(i);
//	            XWPFDocument xdoc = new XWPFDocument(OPCPackage.open(fis));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		
	}

}
