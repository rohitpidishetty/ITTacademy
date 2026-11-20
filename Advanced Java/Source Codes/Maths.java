import java.util.Arrays;

public class Maths {

  public static void main(String[] args) {
    // Math
    System.out.println(Math.pow(2, 5));
    System.out.println(Math.ceil(1.9));
    System.out.println(Math.floor(1.9));
    System.out.println(Math.round(7.23));
    System.out.println(Math.PI);
    System.out.println(Math.abs(-9));
    System.out.println(Math.log(8) / Math.log(2));
    System.out.println(Math.tan(45));

    String sentence = new String("hello hyderabad");
    String[] tokens = sentence.split(" ");
    System.out.println(tokens);
    System.out.println(Arrays.toString(tokens));
    System.out.println(String.join(" ", tokens));
  }
}
