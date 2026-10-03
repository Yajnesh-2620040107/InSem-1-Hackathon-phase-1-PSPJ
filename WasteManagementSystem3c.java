import java.util.Scanner;
public class WasteManagementSystem3c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter waste collected from Point 1 (in kg): ");
        double point1 = sc.nextDouble();

        System.out.print("Enter waste collected from Point 2 (in kg): ");
        double point2 = sc.nextDouble();

        
        double totalWaste = calculateTotalWaste(point1, point2);

        System.out.println(" Waste Collection Summary");
        System.out.println("Collection Point 1: " + point1 + " kg");
        System.out.println("Collection Point 2: " + point2 + " kg");
        System.out.println("Total Waste Collected: " + totalWaste + " kg");

        sc.close();
    }
    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }
}
    
    
    

