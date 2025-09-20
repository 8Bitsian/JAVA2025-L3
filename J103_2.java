// Part 2 of Lab Project
public class J103_2 {
  public static void main(String[] args) {
    // Get user input for weight and height
    System.out.print("Enter weight in kilograms: ");
    double weightKg = input.nextDouble();
    System.out.print("Enter height in centimeters: ");
    double heightCm = input.nextDouble();
    
    // Define constant variables
    final double LBS_PER_KG = 2.2046;
    final double IN_PER_CM = 0.3937;
    final double IN_PER_FT = 12.0
    final double CM_PER_M = 100.0;

    // Calculate weight and height conversions
    double weightLbs = weightKg * LBS_PER_KG;
    double totalInches = heightCm * IN_PER_CM;
    double heightFt = totalInches / IN_PER_FT;
    double heightIn = totalInches % IN_PER_FT;

    // Calculate BMI
    double heightM = heightCm / CM_PER_M;
    double bmi = weightKg / (heightM * heightM);
    
    // Determine BMI Category
    int bmiCase = (bmi < 18.5) ? 1 : (bmi < 25) ? 2 : (bmi < 30) ? 3 : 4;
    switch(bmiCase) {
      case 1: System.out.println("Underweight"); break;
      case 2: System.out.println("Normal"); break;
      case 3: System.out.println("Overweight"); break;
      case 4: System.out.println("Obese"); break;

    // Output results
    System.out.printf("Weight (lbs): %.2f\n", weightLbs);
    System.out.printf("Height (ft):  %.2f\n", heightft);
    System.out.printf("Height (in):  %.2f\n", heightIn);
    System.out.println("==========================");
    System.out.printf("Your BMI is %.2f which is %s\n", bmi, category);
  }
}
