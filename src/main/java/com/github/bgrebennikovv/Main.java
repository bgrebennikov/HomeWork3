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

        float floatNumber = 27.12f;
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

        short totalStudents = (short) (studentsLudmila + studentsAnna + studentsEkaterina);
        short sheetsPerStudent = (short) (480 / totalStudents);

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

        byte numberOfClasses = 120 / 6;

        byte whitePaint = (byte) (2 * numberOfClasses);
        byte blownPaint = (byte) (4 * numberOfClasses);

        System.out.printf("""
                        В школе, где %s классов, нужно %s банок белой краски и %s банок коричневой краски
                        """,
                numberOfClasses,
                whitePaint,
                blownPaint
        );

        System.out.println("\nTask 6\n");

        short bananaGr = 80;
        short milkGr = 105;
        short iceCreamGr = 100;
        short egg = 70;

        short breakfastWeightGr = (short) ((bananaGr * 5) + (milkGr * 10) + (iceCreamGr * 2) + (iceCreamGr * 2) + (egg * 4));
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

        short lossPerDayMin = 250;
        short lossPerDayMax = 500;

        short daysMin = (short) (weightToLose / lossPerDayMin);
        short daysMax = (short) (weightToLose / lossPerDayMax);
        short averageDays = (short) ((daysMin + daysMax) / 2);

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

        System.out.println("\nTask 8\n");

        // Используем double т.к. при работе с финансами необходим более точный тип данных.
        double mashaSalary = 67760.00;
        double denisSalary = 83690.00;
        double kristinaSalary = 76230.00;

        double mashaSalaryIndexed = mashaSalary * 1.1;
        double denisSalaryIndexed = denisSalary * 1.1;
        double kristinaSalaryIndexed = kristinaSalary * 1.1;

        System.out.printf("""
                        Зарплаты сотрудников до индексации:
                        Маша %.2f Рублей/мес. Годовой доход: %.2f Рублей.
                        Денис %.2f Рублей/мес. Годовой доход: %.2f Рублей.
                        Кристина %.2f Рублей/мес. Годовой доход: %.2f Рублей.
                        
                        Зарплаты сотрудников после индексации:
                        Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.
                        Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.
                        Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.
                        """,
                mashaSalary, mashaSalary * 12,
                denisSalary, denisSalary * 12,
                kristinaSalary, kristinaSalary * 12,

                mashaSalaryIndexed, (mashaSalaryIndexed - mashaSalary) * 12,
                denisSalaryIndexed, (denisSalaryIndexed - denisSalary) * 12,
                kristinaSalaryIndexed, (kristinaSalaryIndexed - kristinaSalary) * 12
        );


    }
}