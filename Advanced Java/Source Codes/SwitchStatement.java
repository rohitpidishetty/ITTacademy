public class SwitchStatement {

  public static void main(String[] args) {
    String day = "sunday";

    if (day.equals("Sunday") || day.equals("sunday")) {
      System.out.println("Paneer");
    } else if (day.equals("Monday")) {
      System.out.println("Aloo");
    } else if (day.equals("Tuesday")) {
      System.out.println("Cauliflower");
    } else if (day.equals("Wednesday")) {
      System.out.println("Cabbage");
    } else if (day.equals("Thursday")) {
      System.out.println("Brocoli");
    } else if (day.equals("Friday")) {
      System.out.println("Noodles");
    } else if (day.equals("Saturday")) {
      System.out.println("Ice cream");
    } else {
      System.out.println("Incorrect, please enter a correct day");
    }

    switch (day) {
      case "Sunday", "sunday":
        // Code
        System.out.println("Paneer");
        break; // To exit a block {}
      case "Monday":
        System.out.println("Aloo");
        break;
      case "Tuesday":
        System.out.println("Cauliflower");
        break;
      case "Wednesday":
        System.out.println("Cabbage");
        break;
      case "Thursday":
        System.out.println("Brocoli");
        break;
      case "Friday":
        System.out.println("Noodles");
        break;
      case "Saturday":
        System.out.println("Ice cream");
        break;
      default:
        System.out.println("Incorrect, please enter a correct day");
        break;
    }
  }
}
