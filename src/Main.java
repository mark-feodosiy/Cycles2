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
        {
            // Задача № 2
            int i = 11;
            while (i > 1) {
                i--;
                System.out.print(i + " ");
            }
            System.out.println();
            for (int n = 1; n <= 10; n++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

}