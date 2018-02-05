import java.io.*;
import java.util.Scanner;

public class FileReadWrite{
	
	public String path = "src/file.txt";
	public String line = null;
	Scanner userWrite = new Scanner(System.in);
	
	public void ReadingFile() {
		
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
			
		//for errors	
		} catch(FileNotFoundException e){
			System.out.println("Unable to open file "+path);
		} catch(IOException ex){
			System.out.println("Error reading file "+path);
		}//end catch
		
	}//end ReadingFile
	
	public void WritingFile() {
		try {
          
            FileWriter fw = new FileWriter(path,true);
            BufferedWriter bw = new BufferedWriter(fw);

            System.out.println("Type what you want to add to the file");
            
            bw.newLine();
            bw.write(userWrite.nextLine());

            bw.close();
        }
        catch(IOException ex) {
            System.out.println("Error writing to file" + path);
           
        }
	}//end WritingFile
	
}