public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + salary;
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task3() {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 3");
        int peopleY = 12_000_000;
        int natalitYear = (peopleY / 1000) * 17;
        int mortalitYear = (peopleY / 1000) * 8;
        int peopleTotal = peopleY + (natalitYear - mortalitYear);
        int i = 0;
        while (i < 10) {
            i = i + 1;
            peopleTotal = i * (natalitYear - mortalitYear) + peopleY;
            System.out.println("Год " + i + " численность населения составляет " + peopleTotal);
        }
    }

    public static void task5() {
        System.out.println("Задача 4");
        int salary = 15000;
        double total = 0;
        int i = 0;
        double percent = 0.07;
        while (total < 12_000_000) {
            total = (total + salary) * (1 + percent);
            i = i + 1;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task6() {
        System.out.println("Задача 5");
        int salary = 15000;
        double total = 0;
        int i = 0;
        double percent = 0.07;
        while (total < 12_000_000) {
            total = (total + salary) * (1 + percent);
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 6");
        int salary = 15000;
        double total = 0;
        int i = 0;
        double percent = 0.07;
        while (i < 108) {
            total = (total + salary) * (1 + percent);
            i = i + 1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task8() {
        System.out.println("Задача 7");
        int friday = 5;
        for (; friday <= 31; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + " -е число. Необходимо подготовить отчет. ");
        }
    }

    public static void task9() {
        System.out.println("Задача 8");
        for (int year = 1822; year <= 2122; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}






