public class Flight_Management_Sys {
    // A very basic flight management system.
    public static void manageFlightBooking(int[] flight, int[] customer, int[] booking) {

        int flight_count = flight.length;
        int customer_count = customer.length;
        int booking_count = booking.length;
        int[] flight_booking = new int[flight_count];
        int[] customer_booking = new int[customer_count];
        int[] booking_flight = new int[booking_count];
        for (int i = 0; i < flight_count; i++) {
            flight_booking[i] = 0;
        }
        for (int i = 0; i < customer_count; i++) {
            customer_booking[i] = 0;
        }
        for (int i = 0; i < booking_count; i++) {
            booking_flight[i] = 0;
        }
        for (int i = 0; i < booking_count; i++) {
            int flight_id = booking[i];
            int customer_id = customer[i];
            int booking_id = flight[i];
            flight_booking[flight_id]++;
            customer_booking[customer_id]++;
            booking_flight[booking_id]++;
        }
        for (int i = 0; i < flight_count; i++) {
            if (flight_booking[i] > 1) {
                System.out.println("Flight " + i + " has " + flight_booking[i] + " bookings.");
            }
        }
        for (int i = 0; i < customer_count; i++) {
            if (customer_booking[i] > 1) {
                System.out.println("Customer " + i + " has " + customer_booking[i] + " bookings.");
            }
        }
        for (int i = 0; i < booking_count; i++) {
            if (booking_flight[i] > 1) {
                System.out.println("Booking " + i + " is booked on flight " + booking[i] + ".");
            }
        }

    }
    
    public static void main(String[] args) {
        int flight[] = {0, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int customer[] = {0, 3, 2, 3, 5, 5, 6, 9, 8, 9};
        int booking[] = {0, 3, 2, 3, 4, 5, 6, 6, 8, 9};
        manageFlightBooking(flight, customer, booking);
    }
}
