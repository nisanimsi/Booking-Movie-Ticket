import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Örnek Film Listesi
        Movie movie1 = new Movie("Interstellar", "Sci-Fi");
        
        System.out.println("=== Film Bilet Rezervasyon Sistemi ===");
        System.out.print("Adınız: ");
        String name = scanner.nextLine();
        
        System.out.print("Koltuk seçiniz (1-50): ");
        int seat = scanner.nextInt();

        // Bilet oluşturma
        Ticket myTicket = new Ticket(movie1, name, seat);
        
        System.out.println("\nRezervasyon Başarılı!");
        myTicket.displayTicketInfo();

        scanner.close();
    }
}
