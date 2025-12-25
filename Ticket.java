public class Ticket {
    private Movie movie;
    private String customerName;
    private int seatNumber;

    public Ticket(Movie movie, String customerName, int seatNumber) {
        this.movie = movie;
        this.customerName = customerName;
        this.seatNumber = seatNumber;
    }

    public void displayTicketInfo() {
        System.out.println("--- BİLET DETAYI ---");
        System.out.println("Müşteri: " + customerName);
        System.out.println("Film: " + movie.getTitle() + " (" + movie.getGenre() + ")");
        System.out.println("Koltuk No: " + seatNumber);
    }
}
