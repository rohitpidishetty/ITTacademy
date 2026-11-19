public class Strings {

  public static void main(String[] args) {
    String name = new String("bob");
    System.out.println(name.charAt(2));
    System.out.println(name.codePointAt(0));
    System.out.println(name.codePointBefore(1));
    System.out.println(name.compareTo("bob"));
    System.out.println(name.concat("o"));
    System.out.println(name.contains("a"));
    System.out.println(name.startsWith("bo"));
    System.out.println(name.endsWith("b"));
    System.out.println(name.equals("bob"));
    System.out.println(name.hashCode());
    System.out.println(name.indexOf("o"));
    System.out.println(name.indexOf("b"));
    System.out.println(name.lastIndexOf("b"));
    System.out.println(name.length());
    System.out.println(name.repeat(2));
    System.out.println(name.replace("b", "d"));
    String name2 = new String("hyderabad");
    System.out.println(name2.substring(3, 6));
    System.out.println(name.trim());
    System.out.println(new String("             hi         ").trim().length());
    System.out.println(name.toUpperCase());
    char ch[] = name.toCharArray();
    System.out.println(name instanceof String);
    System.out.println(ch instanceof char[]);
    System.out.println(ch[0]);
    // Method chaining
  }
}
