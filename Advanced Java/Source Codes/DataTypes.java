public class DataTypes {

  public static void main(String[] args) {
    byte var = -128; // -128 to 127
    short sh = 123;
    // int < long

    int var2 = var;
    System.out.println(sh);
    System.out.println(var);
    System.out.println(var2);
    // byte < short < int < long : Auto type cast

    float marks = 98.2f;
    double marks2 = 99.9f;

    char ch = 'a';
    int c = ch;
    System.out.println(ch);
    System.out.println(c);

    // Non primitive

    byte buffer[] = new byte[5];
    byte var_array[] = { -128 }; // -128 to 127

    String name = new String("rohit");
  }
}
