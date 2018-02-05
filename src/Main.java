
public class Main {

	public static void main(String[] args) {
		FileReadWrite fileIO = new FileReadWrite();
		System.out.println("Reading File...");
		fileIO.ReadingFile();
		System.out.println("Writing File...");
		fileIO.WritingFile();
		System.out.println("Rereading File...");
		fileIO.ReadingFile();

	}

}
