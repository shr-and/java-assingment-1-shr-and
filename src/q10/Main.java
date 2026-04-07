import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] tokens = line.split(" ");

        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            // check if operator
            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();

                int result = 0;

                if (token.equals("+")) result = a + b;
                else if (token.equals("-")) result = a - b;
                else if (token.equals("*")) result = a * b;
                else if (token.equals("/")) result = a / b;

                stack.push(result);
            } else {
                // operand
                stack.push(Integer.parseInt(token));
            }
        }

        System.out.println(stack.pop());
    }
}
