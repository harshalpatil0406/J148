package Assignments;

//convert digits into characters
public class assignment_z32 {

    public static String replaceDigits(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                char replacement = (char) ('a' + (ch - '0'));  //0 has ascii value 48
                result.append(replacement);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "a1b2c3";
        String output = replaceDigits(input);
        System.out.println("Modified string: " + output);
    }
}
