import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Exercise1 {
        public static void main(String[] args) {
            String inputFile = "input.txt"; // Change this to the path of your input file
            String outputFile = "output.txt"; // Change this to the path of your output file

            try {
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

                String line;
                while ((line = reader.readLine()) != null) {
                    String[] words = line.split("\\s+"); // Split the line into words based on whitespace
                    for (String word : words) {
                        writer.write(word);
                        writer.write(" "); // Add a space between words
                    }
                    writer.newLine(); // Preserve line breaks
                }

                reader.close();
                writer.close();

                System.out.println("File has been shortened and saved to " + outputFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

