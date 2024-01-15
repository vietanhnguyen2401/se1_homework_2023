package diagram;

import java.util.HashMap;
import java.util.HashSet; // Import HashSet for the spelling checker program
import java.util.ArrayList;


public class SpellingChecker {
    public static ArrayList<Error> spellingChecker(String document, HashSet<String> dictionary) {
        ArrayList<Error> errors = new ArrayList<>();
        String[] lines = document.split("\n");

        for (int lineNumber = 1; lineNumber <= lines.length; lineNumber++) {
            String[] words = lines[lineNumber - 1].split("\\s+");

            for (int position = 1; position <= words.length; position++) {
                String word = words[position - 1];

                if (word.length() > 1 && !dictionary.contains(word.toLowerCase())) {
                    errors.add(new Error(lineNumber, word));
                }
            }
        }

        return errors;
    }

    public static HashMap<String, ArrayList<String>> suggestCorrections(ArrayList<Error> errors, HashSet<String> dictionary) {
        HashMap<String, ArrayList<String>> suggestions = new HashMap<>();

        for (Error error : errors) {
            String word = error.getWord();
            suggestions.put(word, new ArrayList<>());

            for (String dictWord : dictionary) {
                if (dictWord.startsWith(word.toLowerCase())) {
                    suggestions.get(word).add(dictWord);
                }
            }
        }

        return suggestions;
    }

    public static void main(String[] args) {
        String documentToCheck = "This is a smple documnt with speling errors.\nCompiler is used to translate code.\nGet the outpt of the program.";

        HashSet<String> dictionary = new HashSet<>();
        dictionary.add("this");
        dictionary.add("is");
        dictionary.add("a");
        dictionary.add("sample");
        dictionary.add("document");
        dictionary.add("compiler");
        dictionary.add("used");
        dictionary.add("to");
        dictionary.add("translate");
        dictionary.add("code");
        dictionary.add("get");
        dictionary.add("the");
        dictionary.add("output");
        dictionary.add("of");
        dictionary.add("program");

        ArrayList<Error> spellingErrors = spellingChecker(documentToCheck, dictionary);
        System.out.println("Spelling errors: " + spellingErrors);

        HashMap<String, ArrayList<String>> corrections = suggestCorrections(spellingErrors, dictionary);
        for (String word : corrections.keySet()) {
            System.out.println("Suggestions for \"" + word + "\": " + String.join(", ", corrections.get(word)));
        }
    }
}

class Error {
    private int lineNumber;
    private String word;

    public Error(int lineNumber, String word) {
        this.lineNumber = lineNumber;
        this.word = word;
    }

    public int getLineNumber() {
        return lineNumber;
    }

    public String getWord() {
        return word;
    }

    @Override
    public String toString() {
        return lineNumber + ": " + word;
    }
}
