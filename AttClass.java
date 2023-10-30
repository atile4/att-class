public class AttClass {
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
