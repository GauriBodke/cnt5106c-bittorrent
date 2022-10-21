import java.util.*;
import java.io.*;

public class ReadFile {
    private static String workingDirectory = System.getProperty("user.dir");

    private ReadFile() {}

    public List<String> read(String filePath){
		List<String> fileContent = new ArrayList<>();
		if(filePath != null && filePath.length() > 0) {
            String fullFilePath = workingDirectory + filePath;
			try {
				FileReader fileReader = new FileReader(fullFilePath);
				BufferedReader bufferReader = new BufferedReader(fileReader);
				String currentLine = "";
				while((currentLine = bufferReader.readLine()) != null) {
					fileContent.add(currentLine);
				}
				bufferReader.close();
			} catch(IOException e) {
				e.printStackTrace();
			}

		}	
		return fileContent;
	}
}