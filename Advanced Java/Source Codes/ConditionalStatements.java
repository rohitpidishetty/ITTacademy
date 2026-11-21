public class ConditionalStatements {

  public static void main(String[] args) {
    System.out.println("Conditional Statements");
    // If (you come by 12) {
    //  you will be allowed to enter the gate
    // }
    // else {
    //  your legs will be broken.
    // }

    //  if CONDITION:Relational Ops {
    //    outcome1
    //  }
    //  else {
    //    outcome2
    //  }

    int time = 9;

    if (time < 12) {
      System.out.println("Enter home");
    } else {
      System.out.println("Broken legs");
    }

    System.out.println("Execution is here");

    int age = 16;

    if (age >= 18) {
      System.out.println("Allowed to enter the pub");
    } else {
      // %d - int
      System.out.printf(
        "You are not allowed to enter, please wait for %d years to enter the club\n",
        (18 - age)
      );
    }

    // Marks

    // if - else if - else

    int marks = 93;
    // marks >= 75 and marks <= 100 : Distinction
    if (marks >= 75 && marks <= 100) {
      System.out.println("Distinction");
    } else if (marks >= 65 && marks <= 74) {
      System.out.println("Firstclass");
    } else if (marks >= 55 && marks <= 64) {
      System.out.println("Secondclass");
    } else if (marks >= 45 && marks <= 54) {
      System.out.println("Thirdclass");
    } else {
      System.out.println("Fail");
    }

    // Ex2
    if (marks >= 75 && marks <= 100) {
      System.out.println("Distinction");
    } else {
      if (marks >= 65 && marks <= 74) {
        System.out.println("Firstclass");
      } else {
        if (marks >= 55 && marks <= 64) {
          System.out.println("Secondclass");
        } else {
          if (marks >= 45 && marks <= 54) {
            System.out.println("Thirdclass");
          } else {
            System.out.println("Fail");
          }
        }
      }
    }

    // If-else ladder

    boolean ground = true;
    boolean faculty = false;
    boolean activities = true;

    if (faculty == true) {
      if (ground == true) {
        if (activities == true) {
          System.out.println("Ok");
        } else {
          System.out.println("No activities");
        }
      } else {
        System.out.println("No ground");
      }
    } else {
      System.out.println("No faculty");
    }
  }
}
