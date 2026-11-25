public class ForLoop {

  public static void main(String[] args) {
    // For loop
    // For, While, Do-while
    // for(initialization, halting-condition, incrementation) {block of code}
    int i = 0;
    while (i < 20) {
      if ((i % 2) == 0) {
        System.out.println("Even " + i);
      }
      i++;
    }

    /**
     * 1. Initialization
     * 2. Condition check
     * 2.0 Yes
     * 2.0.0 Executes block
     * 2.0.1 Incrementation
     * 2.0.2 go to step 2
     * 2.1 No
     * 2.1.0 Halt/Terminate
     */

    System.out.println("Value of i, while entering into do while " + i);
    do {
      System.out.println(i);
    } while (i < 10);

    i = 1;
    while (i < 10) {
      int j = 1;
      while (j < 10) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
        j++;
      }
      System.out.println();
      i++;
    }
  }
}
