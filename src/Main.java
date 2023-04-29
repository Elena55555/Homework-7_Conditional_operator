import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Домашняя работа № 7");
        System.out.println("Задание  № 1");

        float contribution = 15000f;
        float total = 0f;
        int i = 0;


        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + contribution;
            i++;

            System.out.println("Месяц " + i + " сумма накоплений равна " + total);
        }
        System.out.println(i);
        System.out.println(total);

        System.out.println("Задание  № 2");

        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println(" ");


        for (int a1 = 10;a1 >= 1;a1--  ) {
            System.out.print(a1 + " ");

        }

        System.out.println(" ");

        System.out.println("Задание  № 3");

        int population = 12000000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        int i1 = 2023;
        while (i1 <= 2032) {
            population += population * dif / 1000;
            i1++;

            System.out.println("Год " + i1 + " численность населения составляет " + population);

        }
        System.out.println(population);

        System.out.println("Задание  № 4");


        int monthlyСontribution = 15000;
        int totalWithPenny = 0;
        i = 0;
        while (totalWithPenny < 12000000) {
            totalWithPenny = totalWithPenny + totalWithPenny * 7 / 100;
            totalWithPenny= totalWithPenny+ monthlyСontribution;
            i++;
            System.out.println("Месяц " + i + " сумма накоплений равна " +  totalWithPenny);
        }

        System.out.println("Задание  № 5");

        int monthlyСontribution1 = 15000;
        int totalWithPenny1 = 0;
        i1 = 0;
        while (totalWithPenny1 < 12000000) {
            totalWithPenny1 = totalWithPenny1 + totalWithPenny1 * 7 / 100;
            totalWithPenny1 = totalWithPenny1 + monthlyСontribution1;
            i1++;
            if (i1 % 6 == 0) {
                System.out.println("Месяц " + i1 + " сумма накоплений равна " + totalWithPenny1);
            }

        }
        System.out.println("Задание  № 6");

        int monthlyСontribution2 = 15000;
        int totalWithPenny2 = 0;
        i = 0;

        while (totalWithPenny2 < 12000000) {
            totalWithPenny2 = totalWithPenny2 + totalWithPenny2 * 7 / 100;
            totalWithPenny2 = totalWithPenny2 + monthlyСontribution2;

            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений за 6 месяцев (полгода) равна " + totalWithPenny2);
            }

        }
        i=60;
        while (i <= 108) {
            totalWithPenny2 = totalWithPenny2 + totalWithPenny2 * 7 / 100;
            totalWithPenny2 = totalWithPenny2 + monthlyСontribution2;

            i++;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений за 6 месяцев (полгода) равна " + totalWithPenny2);
            }

        }




        System.out.println("Задание  № 7");

        int Friday = 2;
        int i5 = 0;


        while (Friday <= 31) {
            Friday = Friday + 7;
            i++;
            if (Friday >= 31) {
                break;
            }
            System.out.println("Сегодня пятница, " + Friday+ " - число. " + " Необходимо подготовить отчет ");
        }


        System.out.println("Задание  № 8");



        for (int year0 = (2023 - 200); year0  <= 2023; year0 ++) {
            if (year0  % 79 == 0) {
                System.out.println(year0);
                break;
            }

        }

        for (int year1 = 1975; year1  <= (1975+100); year1 ++) {
            if (year1  % 79 == 0) {
                System.out.println(year1);
            }

        }










    }
}




























































