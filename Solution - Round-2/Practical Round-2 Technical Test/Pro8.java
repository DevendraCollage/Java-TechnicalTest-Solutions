// W.A.P. that copies itself in another file called code.txt.

// Import required classes for implement the problem
import java.io.*;

public class Pro8 {
    public static void main(String[] args) throws IOException {
        // Create the instance of the File class
        File inputFile = new File(
                "C:\\Users\\Devendra\\Desktop\\Techical Test Round-2\\Techicanl Test Revision and Solution\\Devendra\\Practical Round-2 Technical Test\\Input.txt");
        File outputFile = new File(
                "C:\\Users\\Devendra\\Desktop\\Techical Test Round-2\\Techicanl Test Revision and Solution\\Devendra\\Practical Round-2 Technical Test\\Output.txt");

        // Create the instance of the FilRead and FileWriter class
        FileReader fr = new FileReader(inputFile);
        FileWriter fw = new FileWriter(outputFile);
        int c;

        while ((c = fr.read()) != -1) { // This read the file when the file is empty
            fw.write(c);
        }

        fr.close();
        fw.close();
    }
}
