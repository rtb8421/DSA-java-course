package Input;
public class string {
        public static void main(String[] args) {
            String text = "Rohan Patel";
            System.out.println("Original String: " + text);

            System.out.println("Length of the string: " + text.length());

            char charAtIndex = text.charAt(4);
            System.out.println("Character at index 4: " + charAtIndex);

            int indexOfN = text.indexOf('n');
            System.out.println("Index of 'n': " + indexOfN);

            String substring = text.substring(7);
            System.out.println("Substring from index 7: " + substring);

            String lowercaseText = text.toLowerCase();
            System.out.println("Lowercase text: " + lowercaseText);

            String uppercaseText = text.toUpperCase();
            System.out.println("Uppercase text: " + uppercaseText);

            String stringWithSpaces = "    Rohan Patel    ";
            String trimmedText = stringWithSpaces.trim();
            System.out.println("Trimmed text: " + trimmedText);

            boolean startsWithRohan = text.startsWith("Rohan");
            System.out.println("Starts with 'Rohan': " + startsWithRohan);

            boolean endsWithPatel = text.endsWith("patel");
            System.out.println("Ends with 'patel': " + endsWithPatel);

            String replacedText = text.replace("Rohan", "RTB");
            System.out.println("Replaced text: " + replacedText);

            boolean containsRohan = text.contains("Rohan");
            System.out.println("Contains 'Rohan': " + containsRohan);

            String[] splitText = text.split("RTB ");
            System.out.println("Split text: ");
            for (String word : splitText) {
                System.out.println(word);
            }

            String emptyString = "";
            System.out.println("Is the string empty? " + emptyString.isEmpty());

            String compareString = "Rohan Patel";
            int compareToResult = text.compareTo(compareString);
            System.out.println("Compare to 'Rohan Patel': " + compareToResult);

            boolean isEqual = text.equals(compareString);
            System.out.println("Is equal to 'Rohan Patel': " + isEqual);

            String concatenatedText = text.concat("RTB");
            System.out.println("Concatenated text: " + concatenatedText);

            String internedString = text.intern();
            System.out.println("Interned string: " + internedString);
        }
    }
