import java.util.Stack;

public class ValidParanthesis {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char ch: s.toCharArray()){
            switch(ch){
                case '(' : stack.push(')'); break;
                case '{' : stack.push('}'); break;
                case '[' : stack.push(']'); break;
                default : {
                    if(stack.isEmpty() || stack.pop() != ch){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String valid = "() {";
        System.out.println(isValid(valid));
    }
}
