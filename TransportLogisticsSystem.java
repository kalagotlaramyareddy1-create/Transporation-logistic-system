import java.util.ArrayList;
import java.util.HashMap;

// Custom Exception
class NoVehicleAvailableException extends Exception {
    public NoVehicleAvailableException(String message) {
        super(message);
    }
}

public class TransportLogisticsSystem {

    // Collection Framework usage
    static ArrayList<String> vehicles = new ArrayList<>();
    static ArrayList<String> drivers = new ArrayList<>();
    static HashMap<String, String> shipments = new HashMap<>();

    public static void main(String[] args) {

        System.out.println("===== TRANSPORT & LOGISTICS MANAGEMENT SYSTEM =====");

        try {
            // Step 1: Order Placement
            String orderId = "ORD101";
            System.out.println("Order Placed: " + orderId);

            // Step 2: Add Resources
            addVehicles();
            addDrivers();

            // Step 3: Check Vehicle Availability
            if (vehicles.isEmpty()) {
                throw new NoVehicleAvailableException("No vehicles available for delivery.");
            }

            // Step 4: Assign Vehicle & Driver
            String vehicle = vehicles.get(0);
            String driver = drivers.get(0);

            System.out.println("Vehicle Assigned: " + vehicle);
            System.out.println("Driver Assigned: " + driver);

            // Step 5: Route Planning
            String source = "Hyderabad";
            String destination = "Vijayawada";
            int distance = 275;

            System.out.println("Route: " + source + " → " + destination + " (" + distance + " km)");

            // Step 6: Shipment Creation
            String shipmentId = "SHIP501";
            shipments.put(shipmentId, "In Transit");
            System.out.println("Shipment Created: " + shipmentId);

            // Step 7: Tracking
            System.out.println("Shipment Status: " + shipments.get(shipmentId));

            // Step 8: Delivery
            shipments.put(shipmentId, "Delivered");
            System.out.println("Shipment Status: " + shipments.get(shipmentId));

            System.out.println("===== DELIVERY COMPLETED SUCCESSFULLY =====");

        } catch (NoVehicleAvailableException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e);
        }
    }

    // Add vehicles
    static void addVehicles() {
        vehicles.add("V101 - Truck");
        vehicles.add("V102 - Mini Truck");
    }

    // Add drivers
    static void addDrivers() {
        drivers.add("D201 - Ramesh");
        drivers.add("D202 - Suresh");
    }
}