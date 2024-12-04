package com.github.bgrebennikovv;

public class Main {
    public static void main(String[] args) {

        // Task 1
        int intVar;
        byte byteVar;
        short shortVar;
        long longVar;
        float floatVar;
        double doubleVar;

        intVar = 11556975;
        byteVar = 127;
        shortVar = 32000;
        longVar = 8456984463215648543L;
        floatVar = 165.21f;
        doubleVar = 1.7E+30;


        System.out.printf("Значение переменной intVar с типом \"int\" равно %s\n", intVar);
        System.out.printf("Значение переменной byteVar с типом \"byte\" равно %s\n", byteVar);
        System.out.printf("Значение переменной shortVar с типом \"short\" равно %s\n", shortVar);
        System.out.printf("Значение переменной longVar с типом \"long\" равно %s\n", longVar);
        System.out.printf("Значение переменной floatVar с типом \"float\" равно %s\n", floatVar);
        System.out.printf("Значение переменной doubleVar с типом \"double\" равно %s\n\n", doubleVar);

        // Task 2

        double floatNumber = 27.12f;
        long longNumber = 987678965549L;
        double doubleNumber = 2.786;
        int integerNumber = 569;
        int negativeInteger = -159;
        int shortValue = 27897;
        byte byteValue = 67;

        System.out.println("Task 2\n");

        System.out.println("floatNumber: " + floatNumber);
        System.out.println("longNumber: " + longNumber);
        System.out.println("doubleNumber: " + doubleNumber);
        System.out.println("integerNumber: " + integerNumber);
        System.out.println("negativeInteger: " + negativeInteger);
        System.out.println("shortValue: " + shortValue);
        System.out.println("byteValue: " + byteValue);

        System.out.println("\nTask 3\n");

        byte studentsLudmila = 23;
        byte studentsAnna = 27;
        byte studentsEkaterina = 30;

        int totalStudents = studentsLudmila + studentsAnna + studentsEkaterina;
        int sheetsPerStudent = 480 / totalStudents;

        System.out.printf("""
                *Количество учеников*
                
                Людмила Павловна: %s уч.
                Анна Сергеевна: %s уч.
                Екатерина Андреевна: %s уч.
                
                Общее количество учеников: %s
                На каждого ученика рассчитано %s листов бумаги
                
                """, studentsLudmila, studentsAnna, studentsEkaterina, totalStudents, sheetsPerStudent);

        System.out.println("Task 4\n");

        byte capacityPer2Min = 16;
        byte capacityPerMin = (byte) (capacityPer2Min / 2);

        short productionCapacityPer20Min = (short) (capacityPerMin * 20);
        short productionCapacityPerDay = (short) (capacityPerMin * 1440);
        int productionCapacityPer3Days = productionCapacityPerDay * 3;
        int productionCapacityPerMonth = productionCapacityPerDay * 30;


        System.out.printf("""
                        
                        *Для удобства расчетов найдем также количество за 1 минуту производства*
                        За 1 минуту машина производит  %s штук бутылок.
                        
                        За 2 минуты машина произвела %s штук бутылок.
                        За 20 минут машина произвела %s штук бутылок.
                        За сутки машина произвела %s штук бутылок.
                        За 3 дня машина произвела %s штук бутылок.
                        За 1 месяц машина произвела %s штук бутылок.
                        
                        """,
                capacityPerMin,
                capacityPer2Min,
                productionCapacityPer20Min,
                productionCapacityPerDay,
                productionCapacityPer3Days,
                productionCapacityPerMonth
        );

        System.out.println("Task 5\n");

        short numberOfClasses = 120 / 6;

        short whitePaint = (short) (2 * numberOfClasses);
        short blownPaint = (short) (4 * numberOfClasses);

        System.out.printf("""
                        В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски
                        """,
                numberOfClasses,
                whitePaint,
                blownPaint
        );

        System.out.println("\nTask 6\n");

        int bananaGr = 80;
        int milkGr = 105;
        int iceCreamGr = 100;
        int egg = 70;

        int breakfastWeightGr = (bananaGr * 5) + (milkGr * 10) + (iceCreamGr * 2) + (iceCreamGr * 2) + (egg * 4);
        float breakfastWeightKg = (float) breakfastWeightGr / 1000;

        System.out.printf("""
                        Вес ингредиентов (поштучно):
                        Банан: %s гр.
                        Молоко (100 мл): %s гр.
                        Мороженное: %s гр.
                        Яйцо сырое: %s гр.
                        
                        Общий вес завтрака согласно рецепту - %s Грамм (%s Кг)
                        В составе которого:
                            - Бананы  5 штук (1 банан — 80 грамм)
                            - Молоко 200 мл (100 мл = 105 грамм)
                            - Мороженое-пломбир 2 брикета по 100 грамм
                            - Яйца сырые – 4 яйца
                        """,
                bananaGr, milkGr, iceCreamGr, egg,
                breakfastWeightGr, breakfastWeightKg
        );

        System.out.println("\nTask 7\n");

        int weightToLose = 7000;

        int lossPerDayMin = 250;
        int lossPerDayMax = 500;

        int daysMin = weightToLose / lossPerDayMin;
        int daysMax = weightToLose / lossPerDayMax;
        int averageDays = (daysMin + daysMax) / 2;

        System.out.printf("""
                        При необходимости сбросить: %s кг.
                        
                        Срок похудения при сбросе %s гр/день: %s дней
                        Срок похудения при сбросе %s гр/день: %s дней
                        
                        В среднем потребуется %s день чтобы добиться результата
                        """,
                (weightToLose / 1000),
                lossPerDayMin, daysMin,
                lossPerDayMax, daysMax,
                averageDays
        );



    }
}