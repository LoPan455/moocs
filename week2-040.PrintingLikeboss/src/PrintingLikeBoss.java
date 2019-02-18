public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {

        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.print("\n");

    }

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 0 ) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int starsToPrint = size - (size - 1);
        int whiteSpacesToPrint = size - 1;
        int iterations = 1;
        while (iterations <= size) {
            printWhitespaces(whiteSpacesToPrint);
            printStars(starsToPrint);
            whiteSpacesToPrint--;
            starsToPrint++;
            iterations++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        printStars(3);
        printTriangle(5);
//        System.out.println("---");
//        xmasTree(4);
//        System.out.println("---");
//        xmasTree(10);
    }
}
