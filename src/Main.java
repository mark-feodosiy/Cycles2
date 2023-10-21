public class Main {
    public static void main(String[] args) {
        System.out.println();
        int days = 10; // изначальное количество дней в Париже
        if (days == 0) {
            System.out.println("Желаем приятной поездки!");
        } else {
            while (days > 0) {
                System.out.println("До конца поездки осталось " + days + " дней.");
                days--;
            }
            System.out.println("Путешествие окончено. Пора возвращаться домой.");
        }
    }

}