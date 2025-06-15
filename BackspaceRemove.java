//remove the # before values and then after removing store it in result and the compare the two strings whether equal or not.
import java.util.Stack;

public class BackspaceRemove {
    public static String removeBackspaces(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c != '#') {
                stack.push(c);  // Add character
            } else if (!stack.isEmpty()) {
                stack.pop();    // Remove last character
            }
        }
        StringBuilder result = new StringBuilder();
        for (char c : stack) {
            result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s = "equ#ual";
        String t = "gee##eeks";

        System.out.println(removeBackspaces(s).equals(removeBackspaces(t))); // False

        String v = "gee#eks";
        String u = "gee##eeks";
        System.out.println(removeBackspaces(v).equals(removeBackspaces(u)));
    }
}

