public class Main {
    public static void main(String[] args) {

        int first = 0;
        int ready = 15000;
        int m = 1;

        while (first <= 2459000) {

            first = first + ready;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + first + " рублей");
            m++;
        }

        int i = 1;

        while (i <= 10) {

            System.out.print(" " + i + " ");
            i++;
        }

        System.out.println();

        for (i = 10; i >= 1; i--) {

            System.out.print(" " + i + " ");
        }

        System.out.println();

        int born = 17;
        int dead = 8;
        int interval = 1000;
        int citizensAtWhole = 12_000_000;
        int difference = born - dead;


        for (int year = 1; year <= 10; year++) {

            System.out.println("Год " + year + ", численность населения состовляет " + citizensAtWhole);
            citizensAtWhole = citizensAtWhole + ((citizensAtWhole / interval) * difference);

        }

        double start = 15000d;
        double percent = 0.07d;


        for (int numberOfMonth = 1; start <= 12000000; numberOfMonth++) {

            System.out.println("Сумма накоплений состовляет " + start + " рублей за " + numberOfMonth + " месяцев");
            start = start + (start * percent);

        }

        double full = 15000d;
        double change = 0.07d;

        for (int month = 0; full <= 12000000; month++) {

            if (month % 6 == 0) {
                System.out.println("Сумма накоплений состовляет " + full + " рублей за " + month + " месяцев");
            }
            full = full + (full * change);


        }
        double anotherStart = 15000d;
        double diff = 0.07d;


        for (int part = 1; part <= 108; part++) {

            anotherStart = anotherStart + (anotherStart * diff);

            if (part % 6 == 0) {
                System.out.println("Сумма накоплений состовляет " + anotherStart + " рублей за " + part + " месяцев");


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