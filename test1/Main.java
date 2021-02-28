import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        
      String[] financialValues = new String[10];
      // These first four should be accepted
      financialValues[0] = "$100.50";
      financialValues[1] = "$12.75";
      financialValues[2] = "-$1.59";
      financialValues[3] = "$1000.32";
      // These last six should be rejected
      financialValues[4] = "100.50";
      financialValues[5] = "-12.75";
      financialValues[6] = "$1.5";
      financialValues[7] = "$100";
      financialValues[8] = "$-50.25";
      financialValues[9] = "$12.758";

      String regularExpression = "";

      Pattern p = Pattern.compile(regularExpression);

      for (int i = 0; i < 10; i++) {
        if (p.matcher(financialValues[i]).matches() == true) {
          System.out.println("Financial value " + i + ": " + financialValues[i] + " is accepted");
        }
        else {
          System.out.println("Financial value " + i + ": " + financialValues[i] + " is rejected");
        }
      }
    }
}
