package ru.idcore.basejava.task0422.firm;

import java.util.ArrayList;
import java.util.Scanner;

public class Firm {
    protected ArrayList<Employee> employees;

    public Firm() {
        this.employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }


    //ввод работника
    public void getEmployee(Scanner scanner) {
        System.out.println("Введите информацию о сотруднике (фамилия, имя, возраст, пол, образование, должность, отдел):");
        String firstName = scanner.next();
        String secondName = scanner.next();
        int age = Integer.parseInt(scanner.next());
        String sex = scanner.next();
        String education = scanner.next();
        String occupation = scanner.next();
        String staff = scanner.next();

        employees.add(
                new Employee(
                        firstName,
                        secondName,
                        age,
                        sex,
                        education,
                        occupation,
                        staff));
    }

    //ввод многих работников
    public void inputEmployees(Scanner scanner) {
        while (true) {
            System.out.println("Добавить сотрудника? (yes/end)");
            String input = scanner.next();
            if (input.equals("yes")) {
                getEmployee(scanner);
            } else if (input.equals("end")) {
                printEmployees();
                break;
            }
        }
    }



    public void printEmployees() {
        Employee.printReportTitle(Employee.PATTERN);
        for (int i = 0; i < employees.size(); i++) {
           employees.get(i).printEmployee(Employee.PATTERN, i);
        }
    }


    //поиск работника по имени
    public int searchEmployeeByName(String firstName, String secondName) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getFirstName().equals(firstName)) {
                if (employees.get(i).getSecondName().equals(secondName)) {
                    return i;
                }
            }
        }
        return -1;
    }

    //редактирование работников
    public void editEmployees(Scanner scanner) {
        while (true) {
            System.out.println("\nИзменить данные сотрудника? (yes/end)");
            String input = scanner.next();
            if (input.equals("yes")) {
                System.out.println("Введите фамилию и имя работника (Например: Иванов Иван):");
                String firstName = scanner.next();
                String secondName = scanner.next();
                int indexEmployee = searchEmployeeByName(firstName, secondName);
                if (indexEmployee != -1) {
                    employees.get(indexEmployee).editEmployeeAttribute(scanner, indexEmployee);
                } else {
                    System.out.println("Работник: " + firstName + " " + secondName + " не найден");
                }
            } else if (input.equals("end")) {
                printEmployees();
                break;
            }
        }
    }

}
