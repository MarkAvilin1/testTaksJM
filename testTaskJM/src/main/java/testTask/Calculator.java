package testTask;

public class Calculator {
    public int calculator(int val1, int val2, char op) {
       return switch (op) {
            case '+' -> val1 + val2;
            case '-' -> val1 - val2;
            case '*' -> val1 * val2;
            case '/' -> val1 / val2;
            default -> throw new IllegalStateException("Unexpected value: " + op);
        };
    }
}
