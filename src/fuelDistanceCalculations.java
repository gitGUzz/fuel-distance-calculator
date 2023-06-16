import java.util.Scanner;

public class fuelDistanceCalculations {
    Scanner sc = new Scanner(System.in);
    public double consumption = Double.parseDouble(sc.nextLine());
    public double tank = Double.parseDouble(sc.nextLine());

    public double distanceToTravel() {
        double consumptionTimesToReach = tank / consumption;
        double distance = consumptionTimesToReach * 100;

        return distance;
    }

    public static void main(String[] args) {
        System.out.print("Please enter:\n> average fuel consumption[1]\n> fuel tank capacity[2]\n\n");
        fuelDistanceCalculations dist = new fuelDistanceCalculations();

        System.out.printf("Distance to travel with [%.2fL/100km] and [%.2f L] of fuel tank capacity: %.2f km.\n",dist.consumption,dist.tank, dist.distanceToTravel());

    }
}
