package Input;
public class StringBuffer {
    public StringBuffer(String s) {

    }

    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer stringBuffer = new StringBuffer("Hello, World!");

        stringBuffer.append(" Welcome to Java.");

        // Insert text at a specific position
        stringBuffer.insert(5, " Awesome");

        // Set a character at a specific index
        stringBuffer.setCharAt(0, 'h');

        // Set the length of the StringBuffer
        stringBuffer.setLength(10);

        // Print the final StringBuffer content
        System.out.println("Final StringBuffer content: " + stringBuffer.toString());
}

    private void append(String s) {
    }

    private void insert(int i, String s) {
    }

    private void setCharAt(int i, char h) {
    }

    private void setLength(int i) {
    }
}
