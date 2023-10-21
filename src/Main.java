public class Main {
    public static void main(String[] args) {
        System.out.println();
        {
            // Задача № 1
            int depositTotal = 0;
            int month = 0;
            while (depositTotal <= 2459000) {
                depositTotal = depositTotal + 15000 + depositTotal / 100;
                month = month + 1;
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + depositTotal + " рублей");
            }
        }
    }

}