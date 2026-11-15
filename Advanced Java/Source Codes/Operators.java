public class Operators {

  public static void main(String[] args) {
    System.out.println("Operators in Java");
    // Arithmetic
    int a = 10;
    int b = 20;
    int c = a + b * 2;
    System.out.println(c);
    System.out.println(a + (b / 2) * 20);

    // Relational
    System.out.println(10 > 5);
    System.out.println((int) 'a' < (int) 'b');
    System.out.println((char) 97);

    // Logical
    System.out.println((10 < 5) && (10 < 5));
    System.out.println((10 > 5) && (10 < 5));
    System.out.println((10 < 5) && (10 > 5));
    System.out.println((10 > 5) && (10 > 5));

    System.out.println((10 < 5) || (10 < 5));
    System.out.println((10 > 5) || (10 < 5));
    System.out.println((10 < 5) || (10 > 5));
    System.out.println((10 > 5) || (10 > 5));

    System.out.println(!false);

    // Bitwise
    a = 5;
    b = 7;
    System.out.println(a & b); // 5
    System.out.println(a ^ b); // 2
    System.out.println(a | b); // 7
    System.out.println(7 << 1);
    System.out.println(7 >> 1);
    System.out.println(~2);

    // Shorthand
    a <<= 5;
    System.out.println(a);
  }
}
