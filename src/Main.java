public class Main {
    public static void main(String[] args) {

        int first = 0;
        int ready = 15000;
        int m = 1;

        while ( first <= 2459000 ) {

            first = first + ready;
            System.out.println("Месяц " + m + ", сумма накоплений равна " + first + " рублей");
            m++;
        }

        int i = 1;

        while ( i<=10 ) {

            System.out.print(" " + i + " " );
            i++;
        }

        System.out.println();

        for ( i =10; i>=1; i--) {

            System.out.print(" " + i + " ");
        }


    }


}