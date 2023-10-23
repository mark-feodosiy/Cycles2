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
        System.out.println();
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
        }
        System.out.println();
        System.out.println();
        {
            // Задача № 3
            int year = 1;
            int population = 12_000_000;
            int deathNumber = population * year / 1000 * 8;
            int birthNumber = population * year / 1000 * 17;
            while (year <= 10) {
                population = population + birthNumber - deathNumber;
                System.out.println("Год " + year + ", численность населения составляет " + population);
                year ++;
            }
        }
        System.out.println();
        {
            // Задача № 4
            int depositTotal = 15000;
            int month = 0;
            while (depositTotal <= 12_000_000) {
                depositTotal = depositTotal + depositTotal / 100 * 7;
                month = month + 1;
                System.out.println("Месяц " + month + ", сумма накоплений равна " + depositTotal + " рублей");
            }
        }
        System.out.println();
        {
            // Задача № 5
            int depositTotal = 15000;
            int month = 0;
            //int sixMonth = 1;
            while (depositTotal <= 12_000_000) {
                depositTotal = depositTotal + depositTotal / 100 * 7;
                month = month + 1;
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + depositTotal + " рублей");
                }
            }
        }
        System.out.println();
        {
            // Задача № 6
            int depositTotal = 15000;
            int month = 0;
            while (month <= 108) {
                depositTotal = depositTotal + depositTotal / 100 * 7;
                month = month + 1;
                if (month % 18 == 0) {
                    System.out.println("Месяц " + month + ", сумма накоплений равна " + depositTotal + " рублей");
                }
            }
        }
        System.out.println();
        {
            // Задача № 7
            int firstFriday = 3;
            int day = 0;
            while (day < 31) {
                day = day + 1;
                if ((day != firstFriday) && ((day - firstFriday) % 7 != 0)) {
                    System.out.println("День " + day);
                   } else {
                    System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                    }

            }
        }
    }
}