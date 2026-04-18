package Saturday_test.question4;


class Passenger {
    private int passengerId;
    private String name;
    private Ticket ticket;

    public Passenger(int passengerId, String name, Ticket ticket) {
        this.passengerId = passengerId;
        this.name = name;
        this.ticket = ticket;
    }

    public void display() {
        System.out.println("Passenger ID: " + passengerId);
        System.out.println("Name: " + name);
        System.out.println("Ticket ID: " + ticket.getTicketId());
        System.out.println("From: " + ticket.getSource());
        System.out.println("To: " + ticket.getDestination());
    }
}