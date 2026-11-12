public class TypeConversion {

  public static void main(String[] args) {
    boolean state = true;
    System.out.println(state);
    float marks = 99.86743f;
    System.out.println(marks);
    int mark = (int) marks;
    long l = 9875435;
    int i = (int) l;
    System.out.println(mark);
    System.out.println(i);

    float m = 12.9f;
    double d = m;
    System.out.println(d);
    float f2 = (float) d;
    System.out.println(f2);
  }
}
