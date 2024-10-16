import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p29 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java prac29 <file> <word>");
            return;
        }

        String fileName = args[0];
        String targetWord = args[1];

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int wordCount = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    if (word.equals(targetWord)) {
                        wordCount++;
                    }
                }
            }
            System.out.println("The word '" + targetWord + "' appears " + wordCount + " times in the file " + fileName);
        } catch (IOException e) {
            System.err.println("Error reading file " + fileName + ": " + e.getMessage());
        }

     
        Integer wrapperInt = Integer.valueOf(10); 
        int primitiveInt = wrapperInt.intValue(); 
        System.out.println("Wrapper Class Example: Integer value is " + wrapperInt + " and primitive int value is " + primitiveInt);
    }
}
