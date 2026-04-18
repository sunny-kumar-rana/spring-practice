package Saturday_test.question4;

class Ticket {
    private int ticketId;
    private String source;
    private String destination;

    public Ticket(int ticketId, String source, String destination) {
        this.ticketId = ticketId;
        this.source = source;
        this.destination = destination;
    }

    public int getTicketId() {
        return ticketId;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
}