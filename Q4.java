import java.io.*;

public class Q4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = new File("C:\\Users\\asilmy.stu\\Documents\\folder 1\\file1.txt");
		listAllFiles(file);
	}
	
	static void listAllFiles(File dir) throws IOException {

//		System.out.println(dir.getAbsolutePath());
//		System.out.println(dir.getCanonicalPath());
//		System.out.println(dir.getPath());
		
		
		
		
		
		
		if(dir.exists()) {
			if(dir.isFile()) {
				System.out.println(dir.getAbsolutePath().substring(dir.getAbsolutePath().lastIndexOf('\\')+1));
			}
			else if(dir.isDirectory()) {
				
			}
			
				
		}
		else {
			return;
		}
		
		
	}
}
