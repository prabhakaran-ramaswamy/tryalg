package tryalg.strman;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class RecursiveFileList {

	static void listFiles(File file, List<String> paths) {
		if (file.isDirectory()) {
			File[] listOfFiles = file.listFiles();
			for (File f : listOfFiles) {
				listFiles(f, paths);
			}
		} else {
			paths.add(file.getAbsolutePath());
		}
	}

	public static void main(String[] args) {
		List<String> paths = new ArrayList<String>();
		listFiles(new File("E:\\t-site"), paths);
		for (String p : paths) {
			System.out.println(p);
		}
	}
}
