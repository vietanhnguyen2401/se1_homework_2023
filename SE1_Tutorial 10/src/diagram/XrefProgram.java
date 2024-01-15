package diagram;

import java.util.HashMap;
import java.util.ArrayList;

public class XrefProgram {
    public static HashMap<String, ArrayList<Position>> createIndex(String document) {
        HashMap<String, ArrayList<Position>> index = new HashMap<>();
        String[] lines = document.split("\n");

        for (int lineNumber = 1; lineNumber <= lines.length; lineNumber++) {
            String[] words = lines[lineNumber - 1].split("\\s+");

            for (int position = 1; position <= words.length; position++) {
                String word = words[position - 1];

                if (word.length() > 1) {
                    String key = word.toLowerCase();
                    if (!index.containsKey(key)) {
                        index.put(key, new ArrayList<>());
                    }
                    index.get(key).add(new Position(lineNumber, position));
                }
            }
        }

        return index;
    }

    public static ArrayList<String> getAllWords(HashMap<String, ArrayList<Position>> index) {
        return new ArrayList<>(index.keySet());
    }

    public static ArrayList<Position> getWordPositions(HashMap<String, ArrayList<Position>> index, String word) {
        String key = word.toLowerCase();
        return index.getOrDefault(key, new ArrayList<>());
    }

    public static void main(String[] args) {
        String document = "This is a sample document.\nCompiler is used to translate code.\nGet the output of the program.";

        HashMap<String, ArrayList<Position>> index = createIndex(document);

        // Display the index
        for (String word : index.keySet()) {
            System.out.print("\"" + word + "\" ");
            for (Position pos : index.get(word)) {
                System.out.print(pos + " ");
            }
            System.out.println();
        }

        // Display all words in the indexed document
        ArrayList<String> allWords = getAllWords(index);
        System.out.println("\nAll words in the indexed document: " + String.join(", ", allWords));

        // Display positions for a specific word
        String wordToCheck = "Compiler";
        ArrayList<Position> positionsForWord = getWordPositions(index, wordToCheck);
        System.out.println("\nPositions for the word \"" + wordToCheck + "\": " + positionsForWord);
    }
}

class Position {
    private int lineNumber;
    private int position;

    public Position(int lineNumber, int position) {
        this.lineNumber = lineNumber;
        this.position = position;
    }

    @Override
    public String toString() {
        return lineNumber + ", " + position;
    }
}
