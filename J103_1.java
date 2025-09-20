// Part 1 of Lab Project
public class J103_2 {
  public static void main(String[] args) {
    // Get user input for weight
    System.out.print("Enter weight in pounds: ");
    double weight = input.nextDouble();            // weight = 50
    System.out.print("Enter height in inches: ");
    double heightIn = input.nextDouble();          // height = 100
    
    // Define Variables
    final double KILOGRAMS_PER_POUND = 0.4535;
    final double METERS_PER_INCH = 0.0254;

    // Calculate Conversions
    double weightInKilograms = weight * KILOGRAMS_PER_POUND;
    double heightInMeters = height * METERS_PER_INCH;

    // Calculate BMI
    double bmi = weightInKilograms / (heightInMeters * heightInMeters);
    System.out.println("BMI is " + bmi);

    // Output BMI range
    if (bmi < 18.5)
      System.out.println("Underweight");
    else if (bmi < 25)
      System.out.println("Normal");
    else if (bmi < 30)
      System.out.println("Overweight");
    else
      System.out.println("Obese");
  }
}
