class Solution {
    public boolean isValid(String s) {
        Stack<Character> St = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '[' || c == '{') {
                St.push(c);
            }
            else {
                if (St.isEmpty()) {
                    return false;
                }

                char top = St.pop();

                if (c == ')' && top != '(' ||
                    c == ']' && top != '[' ||
                    c == '}' && top != '{') {
                    return false;
                }
            }
        }

        return St.isEmpty();
    }
}
        