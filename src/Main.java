public class Main {
    private static final double INTEREST_RATE =0.07d ;

    public static void main(String[] args) {

        int initialAmount = 0;
        int depositAmount = 15000;
        int month = 1;

        while (initialAmount <= 2459000) {

            initialAmount += depositAmount;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + initialAmount + " рублей");
            month++;
        }

        int i = 1;

        while (i <= 10) {

            System.out.print(" " + i + " ");
            i++;
        }

        System.out.println();

        do {

            i--;
            System.out.print(" " + i + " ");

        } while (i > 1);

        System.out.println();

        int born = 17;
        int dead = 8;
        int interval = 1000;
        int citizensAtWhole = 12_000_000;
        int difference = born - dead;


        for (int year = 1; year <= 10; year++) {

            System.out.println("Год " + year + ", численность населения состовляет " + citizensAtWhole);
            citizensAtWhole += ((citizensAtWhole / interval) * difference);

        }

        double start = 15000d;


        for (int numberOfMonth = 1; start <= 12000000; numberOfMonth++) {

            System.out.println("Сумма накоплений состовляет " + start + " рублей за " + numberOfMonth + " месяцев");
            start += (start * INTEREST_RATE);

        }


        for (int numberOfMonth = 0; start <= 12000000; numberOfMonth++) {

            if (numberOfMonth % 6 == 0) {
                System.out.println("Сумма накоплений состовляет " + start + " рублей за " + numberOfMonth + " месяцев");
            }
            start += (start * INTEREST_RATE);


        }



        for (int part = 1; part <= 108; part++) {

            start += (start * INTEREST_RATE);

            if (part % 6 == 0) {
                System.out.println("Сумма накоплений состовляет " + start + " рублей за " + part + " месяцев");


            }
        }

        for (int day = 5; day <= 31; day = day + 7) {

            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");

        }

        for (int year = 0; year <= 2124; year = year + 79) {

            if (year >= 1824) {
                System.out.println(year);
            }
        }


    }
}