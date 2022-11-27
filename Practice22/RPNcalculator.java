package Practice22;

import java.util.EmptyStackException;
import java.util.Stack;

public class RPNcalculator
{
    private final Stack<Double> stack;

    public RPNcalculator() {
        this.stack = new Stack<>();
    }

    private void handleOperand(String operand)
    {
        try
        {
            putOperand(operand);
        }
        catch (NumberFormatException exception)
        {
            executeOperation(operand);
        }
    }

    private void putOperand(String operand)
    {
        double number = Double.parseDouble(operand);
        stack.push(number);
    }

    public double calculate(String input) throws EmptyStackException, IllegalOperandException
    {
        String[] operands = input.split(" ");
        for (String operand : operands) handleOperand(operand);
        return stack.pop();
    }

    private void executeOperation(String operand)
    {
        double operand2 = stack.pop();
        double operand1 = stack.pop();
        switch (operand) {
            case "+" -> stack.push(operand1 + operand2);
            case "-" -> stack.push(operand1 - operand2);
            case "*" -> stack.push(operand1 * operand2);
            case "/" -> stack.push(operand1 / operand2);
            default -> throw new IllegalOperandException();
        }
    }
}