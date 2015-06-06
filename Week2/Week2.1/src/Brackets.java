import java.util.Stack;

public class Brackets {

    public static int countOccurrences(String haystack, char needle) {
        int count = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle) {
                count++;
            }
        }
        return count;
    }

    public boolean isCorrect(String bracks) {
        if (bracks.charAt(0) == ')' || bracks.charAt(bracks.length() - 1) == '(')
            return false;
        else if (countOccurrences(bracks, '(') != countOccurrences(bracks, ')'))
            return false;

        Stack<Character> s = new Stack<Character>();

        for (int i = 0; i < bracks.length(); i++) {
            
            if (bracks.charAt(i) == '(')
                s.push(bracks.charAt(i));
           
            else if (bracks.charAt(i) == ')') {
                if ( s.empty() )
                    return false;
                s.pop();
            }
        }
        return s.isEmpty();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Brackets b = new Brackets();
        System.out.println(b.isCorrect("()()()"));

    }

}
