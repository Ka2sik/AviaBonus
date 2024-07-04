public class Main {
    public static void main(String[] args) {

        int ticketPrice = 25_565;
        int priceForBonus = 20;
        int bonusMiles = ticketPrice / priceForBonus;
        String str1 = String.format("%,d", ticketPrice);
        String str2 = String.format("%,d", bonusMiles);

        System.out.println("Приобретено билетов на сумму: " + str1 + " руб.");
        System.out.println("Получено бонусных миль: " + str2);
    }
}
