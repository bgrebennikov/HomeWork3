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


        System.out.printf("�������� ���������� intVar � ����� \"int\" ����� %s\n", intVar);
        System.out.printf("�������� ���������� byteVar � ����� \"byte\" ����� %s\n", byteVar);
        System.out.printf("�������� ���������� shortVar � ����� \"short\" ����� %s\n", shortVar);
        System.out.printf("�������� ���������� longVar � ����� \"long\" ����� %s\n", longVar);
        System.out.printf("�������� ���������� floatVar � ����� \"float\" ����� %s\n", floatVar);
        System.out.printf("�������� ���������� doubleVar � ����� \"double\" ����� %s\n\n", doubleVar);

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
                *���������� ��������*
                
                ������� ��������: %s ��.
                ���� ���������: %s ��.
                ��������� ���������: %s ��.
                
                ����� ���������� ��������: %s
                �� ������� ������� ���������� %s ������ ������
                
                """, studentsLudmila, studentsAnna, studentsEkaterina, totalStudents, sheetsPerStudent);

        System.out.println("Task 4\n");

        byte capacityPer2Min = 16;
        byte capacityPerMin = (byte) (capacityPer2Min / 2);

        short productionCapacityPer20Min = (short) (capacityPerMin * 20);
        short productionCapacityPerDay = (short) (capacityPerMin * 1440);
        int productionCapacityPer3Days = productionCapacityPerDay * 3;
        int productionCapacityPerMonth = productionCapacityPerDay * 30;


        System.out.printf("""
                        
                        *��� �������� �������� ������ ����� ���������� �� 1 ������ ������������*
                        �� 1 ������ ������ ����������  %s ���� �������.
                        
                        �� 2 ������ ������ ��������� %s ���� �������.
                        �� 20 ����� ������ ��������� %s ���� �������.
                        �� ����� ������ ��������� %s ���� �������.
                        �� 3 ��� ������ ��������� %s ���� �������.
                        �� 1 ����� ������ ��������� %s ���� �������.
                        
                        """,
                capacityPerMin,
                capacityPer2Min,
                productionCapacityPer20Min,
                productionCapacityPerDay,
                productionCapacityPer3Days,
                productionCapacityPerMonth
        );

    }
}