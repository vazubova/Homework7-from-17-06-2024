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


    }


}