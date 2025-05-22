package pertemuan10;

public class Main {
    public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);

        // Sebelum push
        System.out.println("=== Sebelum push ===");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        printStack(stack);

        // Push 3 elemen
        System.out.println("\n=== Push 3 elemen ===");
        stack.push(2);
        stack.push(4);
        stack.push(1);

        // Setelah push
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        printStack(stack);

        // Lakukan pop 2x
        System.out.println("\n=== Pop 2x ===");
        stack.pop();
        stack.pop();

        // Setelah pop
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        printStack(stack);
    }

    public static void printStack(StrukturStack stack) {
        System.out.print("Elemen from TOP: ");
        for (int i = stack.getTop(); i >= 0; i--) {
            System.out.print(stack.getElementAt(i) + " ");
        }
        System.out.println();
    }
}
