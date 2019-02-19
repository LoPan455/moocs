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
    while (amount > 0) {
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
    // Create the method xmasTree(int height) that prints a Christmas tree using the methods printWhitespaces and printStars. A Christmas tree consists of a triangle of given height and a stand. The stand is two stars tall and three stars wide and it is located in the center of the bottom of the triangle. Note: do not print anything in the method itself, just call the helper methods to do the actual printing.

    int stars = height - (height - 1);
    int whiteSpaces = height - 1;
    int baseWhiteSpaces = whiteSpaces - 1;
    int baseStars = 3;

    while (height > 0) {
      printWhitespaces(whiteSpaces);
      printStars(stars);
      whiteSpaces -= 1;
      stars += 2;
      height -= 1;
    }
    printWhitespaces(baseWhiteSpaces);
    printStars(baseStars);
    printWhitespaces(baseWhiteSpaces);
    printStars(baseStars);
  }

  public static void main(String[] args) {
    // Tests do not use main, yo can write code here freely!
    printStars(3);
    System.out.println("---");
    printTriangle(5);
    System.out.println("---");
    xmasTree(4);
    System.out.println("---");
    xmasTree(10);
  }
}
