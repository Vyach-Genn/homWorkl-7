public class Main {
    public static void main(String[] args) {
        // Task 1
        {
            System.out.println("Task 1");
            int salary = 15_000;
            int month = 0;
            int accumulation = 0;
            while (accumulation < 2_459_000) {
                month++;
                accumulation = accumulation + salary;
            }
            System.out.println("Месяц " + month + ", сумма накоплений равна " + accumulation + " рублей");
            System.out.println();
        }
        // Task 24
        {
            System.out.println("Task 2");
            int a = 1;
            while (a <= 10) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
            for (a = 10; a >= 1; a--)
                System.out.print(a + " ");
            System.out.println();
        }
        // Task 3
        {
            System.out.println("Task 3");
            int y = 12_000_000;
            int birthRatePerYear = y / 1_000 * 17;
            int mortalityYear = y / 1_000 * 8;
            int difference = birthRatePerYear - mortalityYear;
            int year = 2000;
            while (year <= 2010) {
                System.out.println("Год " + year + ", численность населения составляет " + y);
                y = y + difference;
                year++;
            }
            System.out.println();
        }
        // Task 4
        {
            System.out.println("Task 4");
            int total = 15_000;
            int month = 0;
            while (total < 12_000_000) {
                total = (int) (total * 1.07);
                month++;
                System.out.println(month + " месяц, сумма накоплений " + total);
            }
            System.out.println();
        }
        // Task 5
        {
            System.out.println("Task 5");
            int month = 0;
            for (int total = 15_000; total < 12_000_000; ) {
                total = (int) (total * 1.07);
                month++;
                if (month % 6 == 0) {
                    System.out.println(month + " месяц, сумма накоплений " + total);
                }
            }
            System.out.println();
        }
        // task 6
        {
            System.out.println("Task 6");
            int total = 15_000;
            for (int month = 1; month <= 12 * 9; month++) {
                total = (int) (total * 1.07);
                if (month % 6 == 0) {
                    System.out.println(month + " месяц, сумма накоплений " + total);
                }
            }
            System.out.println();
        }
        // task 7
        {
            System.out.println("Task 7");
            int friday = 4;
            do {
                System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
                friday = friday + 7;
            } while (friday <= 31);
            System.out.println();
        }
        // Task 8
        {
            System.out.println("Task 8");
            for (int year = 0; year < 2100; year += 79) {
                if (year < 1824) {
                    continue;
                }
                System.out.println(year);
            }
        }

    }
}