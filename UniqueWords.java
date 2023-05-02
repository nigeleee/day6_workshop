package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class UniqueWords {
    


public static void main(String[] args) throws IOException {
    // FileReader r = new FileReader(args[0]);
    // BufferedReader br = new BufferedReader(r);
    // String line;

    // Map<String, Integer> wordCount = new HashMap<>();

    //  while (null != (line = br.readLine())) {
    //     line = line.replaceAll("\\p{Punct}", "").toLowerCase();
    //     String[] words = line.split("\\s+");
    //     }
    // br.close();
    String dirPath = args[0];
        String fileName = args[1];
        String dirPathFileName = dirPath + File.separator + fileName;

        File newDir = new File(dirPath);
        if (newDir.exists()) {
            System.out.println("Directory " + dirPath + "already exists.");
        } else {
            newDir.mkdir();
        }

        File newFile = new File(dirPathFileName);
        if (!newFile.exists()) {
            System.out.println("File " + dirPathFileName + " does not exist.");
            System.exit(0);
        }

        // use FileReader and BufferedReader to read file
        FileReader fr = new FileReader(new File(dirPathFileName));
        BufferedReader br = new BufferedReader(fr);

        StringBuilder sbFileContent = new StringBuilder();
        String lineInput = "";
        
        // while loop to read file into a String variable
        while ((lineInput = br.readLine()) != null) {
            sbFileContent.append(lineInput);
        }

        // close the readers
        br.close();
        fr.close();

        // print out the StringBuilder object sbFileContent
        System.out.println(sbFileContent);

}
}