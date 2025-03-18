package Assignments;

//Char array to String
public class assignment_z23 {
    public static void main(String[] args) {
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};

        String result = "";
        for (char c : charArray) {
            result += c;
        }

        System.out.println("String is - 1 : "+result);

        //Using another method
        String str = new String( charArray );
        System.out.println("String is - 2 : "+str);
    }
}
