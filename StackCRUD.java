import java.util.Stack;

public class StackCRUD {
    private Stack<Integer> stack;

    public StackCRUD() {
        this.stack = new Stack<>();
    }

    // Create operation: push an element onto the stack
    public void push(int element) {
        stack.push(element);
    }

    // Read operation: peek the top element of the stack
    public int peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stack.peek();
    }

    // Update operation: replace the top element of the stack
    public void updateTop(int newElement) {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Cannot update.");
            return;
        }
        stack.pop(); // Remove the top element
        stack.push(newElement); // Push the new element onto the stack
    }

    // Delete operation: pop the top element from the stack
    public void pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty. Nothing to pop.");
            return;
        }
        stack.pop();
    }

    // Utility method to print the stack
    public void printStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = 0; i < stack.size(); i++) {
            System.out.print(stack.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackCRUD stack = new StackCRUD();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        stack.printStack();

        System.out.println("Top element: " + stack.peek());

        stack.updateTop(50);
        stack.printStack();

        stack.pop();
        stack.printStack();
    }
}

