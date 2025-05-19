package S1BM23AI176;

// Interface defining stack operations
interface StackOperations {
    void push(int item);
    int pop();
    void display();
    boolean isEmpty();
    boolean isFull();
}

// Fixed Length Stack Implementation
class FixedLengthStack implements StackOperations {
    private int[] stack;
    private int top;
    private int capacity;

    public FixedLengthStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow (Fixed)");
            return;
        } else {
            stack[++top] = item;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow (Fixed)");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty (Fixed)");
            return;
        }
        System.out.print("Fixed Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }
}

// Dynamic Length Stack Implementation
class DynamicLengthStack implements StackOperations {
    private int[] stack;
    private int capacity;
    private int top;

    public DynamicLengthStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            resizeStack();
        }
        stack[++top] = item;
        System.out.println("Item pushed: " + item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow (Dynamic)");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty (Dynamic)");
            return;
        }
        System.out.print("Dynamic Stack: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    private void resizeStack() {
        int[] newStack = new int[capacity * 2];
        System.arraycopy(stack, 0, newStack, 0, capacity);
        capacity *= 2;
        stack = newStack;
        System.out.println("Stack size resized to: " + capacity);
    }
}

// Main class to test the stacks
public class Interface {
    public static void main(String[] args) {
        StackOperations fixedStack = new FixedLengthStack(5);
        StackOperations dynamicStack = new DynamicLengthStack(5);

        System.out.println("Using Fixed Length Stack:");
        testStack(fixedStack);

        System.out.println("\nUsing Dynamic Length Stack:");
        testStack(dynamicStack);
    }

    public static void testStack(StackOperations stack) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6); // Overflow or resize

        stack.display();

        System.out.println("Popping elements from stack:");
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }
    }
}
