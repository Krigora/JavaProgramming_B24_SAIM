package day50_inheritance;

public class Airport {
    public static void main(String[] args) {

        FlightTicket ticket = new FlightTicket("private jet", "new york", "florida");
        /*
        we cannot access directly
        ticket.type;
        ticket.departureLocation;
        ticket.arrivalLocation;
        */

        System.out.println(ticket.getType());
        System.out.println(ticket.getDepartureLocation());
        System.out.println(ticket.getArrivalLocation());

    }
}
