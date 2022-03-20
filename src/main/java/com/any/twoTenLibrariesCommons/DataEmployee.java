package com.any.twoTenLibrariesCommons;

import org.apache.commons.lang3.StringUtils;

public class DataEmployee {
    public static void main(String[] args) {
        System.out.println(StringUtils.capitalize("Проверка библиотеки"));
        Employee[] dataOfWEmployee = new Employee[10];
        dataOfWEmployee[0] = new Employee(1, StringUtils.upperCase("Nikolaeva"), 01, 100_000);
        dataOfWEmployee[1] = new Employee(1, StringUtils.upperCase("Ivanova"), 05, 200_000);
        dataOfWEmployee[2] = new Employee(1, StringUtils.upperCase("Popov"), 03, 150_000);
        dataOfWEmployee[3] = new Employee(1, StringUtils.upperCase("Petrova"), 04, 123_000);
        dataOfWEmployee[4] = new Employee(1, StringUtils.upperCase("Vasilev"), 03, 110_000);
        dataOfWEmployee[5] = new Employee(1, StringUtils.upperCase("Morozova"), 05, 150_000);
        dataOfWEmployee[6] = new Employee(1, StringUtils.upperCase("Pavlov"), 02, 200_000);
        dataOfWEmployee[7] = new Employee(1, StringUtils.upperCase("Sidorov"), 04, 160_000);
        dataOfWEmployee[8] = new Employee(1, StringUtils.upperCase("Orlov"), 02, 210_000);
        dataOfWEmployee[9] = new Employee(1, StringUtils.upperCase("Romanova"), 01, 300_000);
        
        dataOfWEmployee.toString();
        System.out.println("Метод 1. Вывод всех сотрудников:");
        allEmployee(dataOfWEmployee);

        System.out.println("Метод 2. Сумма затрат на зарплаты:");
        sumOfSalary(dataOfWEmployee);

        System.out.println("Метод 3. Сотрудник с минимальной зарплатой:");
        minSalary(dataOfWEmployee);

        System.out.println("Метод 4. Среднее значение зарплат:");
        midSalary(dataOfWEmployee);

        System.out.println("Метод 5. Сотрудник с максимальной зарплатой:");
        maxSalary(dataOfWEmployee);

        System.out.println("Метод 6. ФИО всех сотрудников");
        onlyNamesEmployee(dataOfWEmployee);
    }


    public static void allEmployee(Employee[] dataOfWEmployee) { //вывести всех сотрудников
        for (int i = 0; i < dataOfWEmployee.length; i++) {
            System.out.println(dataOfWEmployee[i]);
        }
    }

    public static int sumOfSalary(Employee[] dataOfWEmployee) { //сумма зарплат
        int generalSalary = 0;
        for (int i = 0; i < dataOfWEmployee.length; i++) {
            generalSalary = generalSalary + dataOfWEmployee[i].getSalary();
        }
        System.out.println(generalSalary);


        return generalSalary;
    }


    public static void minSalary(Employee[] dataOfWEmployee) { //минимальная зарплата

        int min = dataOfWEmployee[0].getSalary();
        int max = dataOfWEmployee.length;
        for (int i = 0; i < dataOfWEmployee.length; i++) {
            if (dataOfWEmployee[i].getSalary() < min) {
                min = dataOfWEmployee[i].getSalary();
            }
        }
        System.out.println(min);
    }

    public static void maxSalary(Employee[] dataOfWEmployee) { //максимальная зарплата
        int min = dataOfWEmployee[0].getSalary();
        int max = dataOfWEmployee.length;
        for (int i = 0; i < dataOfWEmployee.length; i++) {
            if (dataOfWEmployee[i].getSalary() > min) {
                max = dataOfWEmployee[i].getSalary();
            }
        }
        System.out.println(max);
    }

    public static void midSalary(Employee[] dataOfWEmployee) { //средняя зарплата
        int everyoneSalary = sumOfSalary(dataOfWEmployee);
        double midSalarySum = everyoneSalary / dataOfWEmployee.length;
        System.out.println(midSalarySum);
    }

    public static void onlyNamesEmployee(Employee[] dataOfWEmployee) { //ФИО сотрудников
        for (int i = 0; i < dataOfWEmployee.length; i++) {
            System.out.println(dataOfWEmployee[i].getFamilyName());
        }
    }
}
