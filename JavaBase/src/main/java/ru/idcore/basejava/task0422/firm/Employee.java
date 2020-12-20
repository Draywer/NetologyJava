package ru.idcore.basejava.task0422.firm;

import java.util.Scanner;

public class Employee {
    public static final String PATTERN = "%-5s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%n";

    private String firstName;
    private String secondName;
    private int age;
    private String sex;
    private String education;
    private String occupation;
    private String staff;

    public Employee(String firstName,
                    String secondName,
                    int age,
                    String sex,
                    String education,
                    String occupation,
                    String staff) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.sex = sex;
        this.education = education;
        this.occupation = occupation;
        this.staff = staff;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", education='" + education + '\'' +
                ", occupation='" + occupation + '\'' +
                ", staff='" + staff + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Employee employee = (Employee) object;
        return firstName.equals(employee.firstName) &&
                secondName.equals(employee.secondName) &&
                age == employee.age &&
                sex.equals(employee.sex);
    }

    public static void printReportTitle(String pattern) {
        System.out.println("\nСписок сотрудников:");
        System.out.printf(pattern,
                "Код",
                "Фамилия",
                "Имя",
                "Возраст",
                "Пол",
                "Образование",
                "Должность",
                "Отдел");
    }


    public void printEmployee(String pattern, int indexEmployee) {
        System.out.printf(
                pattern,
                indexEmployee + 1,
                firstName,
                secondName,
                age,
                sex,
                education,
                occupation,
                staff);
    }

    //редактирование значений аттрибутов работника
    public void editEmployeeAttribute(Scanner scanner, int indexEmployee) {
        printReportTitle(PATTERN);
        printEmployee(PATTERN, indexEmployee);

        System.out.println("Изменить Фамилию?");
        while (true) {
            System.out.println("Введите yes/no:");
            String input = scanner.next();

            if (input.equals("yes")) {
                System.out.println("Введите новое значение: ");
                input = scanner.next();
                setFirstName(input);
                break;
            } else if (input.equals("no")) {
                break;
            }
        }

        System.out.println("Изменить Имя?");
        while (true) {
            System.out.println("Введите yes/no:");
            String input = scanner.next();

            if (input.equals("yes")) {
                System.out.println("Введите новое значение: ");
                input = scanner.next();
                setSecondName(input);
                break;
            } else if (input.equals("no")) {
                break;
            }
        }


        while (true) {
            String inputAge = "";
            try {
                System.out.println("Изменить Возраст?");
                System.out.println("Введите yes/no:");
                String input = scanner.next();

                if (input.equals("yes")) {
                    System.out.println("Введите новое значение: ");
                    inputAge = scanner.next();
                    setAge(Integer.parseInt(inputAge));
                    break;
                } else if (input.equals("no")) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Введено некорректное значение для возраста: " + inputAge);
            }
        }

        System.out.println("Изменить Пол?");
        while (true) {
            System.out.println("Введите yes/no:");
            String input = scanner.next();

            if (input.equals("yes")) {
                System.out.println("Введите новое значение: ");
                input = scanner.next();
                setSex(input);
                break;
            } else if (input.equals("no")) {
                break;
            }
        }

        System.out.println("Изменить Образование?");
        while (true) {
            System.out.println("Введите yes/no:");
            String input = scanner.next();

            if (input.equals("yes")) {
                System.out.println("Введите новое значение: ");
                input = scanner.next();
                setEducation(input);
                break;
            } else if (input.equals("no")) {
                break;
            }
        }

        System.out.println("Изменить Должность?");
        while (true) {
            System.out.println("Введите yes/no:");
            String input = scanner.next();

            if (input.equals("yes")) {
                System.out.println("Введите новое значение: ");
                input = scanner.next();
                setOccupation(input);
                break;
            } else if (input.equals("no")) {
                break;
            }
        }

        System.out.println("Изменить Отдел?");
        while (true) {
            System.out.println("Введите yes/no:");
            String input = scanner.next();

            if (input.equals("yes")) {
                System.out.println("Введите новое значение: ");
                input = scanner.next();
                setStaff(input);
                break;
            } else if (input.equals("no")) {
                break;
            }
        }

    }
}

