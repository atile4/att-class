public class AttClass {
/*
AttClass a = new AttClass();

validCheck - Checks if a String/char input is valid.
validCheck(String, String[]) -> boolean

Ex:
char[] inputs = {'a', 'b', 'c', 'd'};
System.out.println(a.validCheck('a', inputs));  -> returns true
System.out.println(a.validCheck('j', inputs));  -> returns false

String[] inputs = {"red", "blue", "green", "yellow"};
System.out.println(a.validCheck("blue", inputs));  -> returns true
System.out.println(a.validCheck("purple", inputs));  -> returns false

array input MUST be initialized first.
 */


    public boolean validCheck(String input, String[] l) {
        for (String s : l) {
            if (input.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public boolean validCheck(char input, char[] l) {
        for (char c : l) {
            if (input == c) {
                return true;
            }
        }
        return false;
    }
}
