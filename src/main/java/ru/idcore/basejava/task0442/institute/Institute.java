package ru.idcore.basejava.task0442.institute;

import java.util.*;

public class Institute {
    private final Map<String, Student> studentMap;

    public Institute() {
        studentMap = new HashMap<>();
    }

    public Map<String, Student> getStudentSet() {
        return studentMap;
    }

    public void addStudent(Scanner scanner) {
        System.out.println("Введите через пробел информацию о студенте: \"[фамилия] [имя] [отчество] [номер студенческого билета] [номер группы]\"");
        String firstName = scanner.next();
        String secondName = scanner.next();
        String thirdName = scanner.next();
        String docNumber = scanner.next();
        String groupNumber = scanner.next();

        Student student = new Student(
                firstName,
                secondName,
                thirdName,
                docNumber,
                groupNumber);

        if(studentMap.containsKey(student.getDocNumber())) {
            System.out.println("Студент с номером студенческого билета: " + student.getDocNumber() + " есть в базе");
        } else {
            studentMap.put(student.getDocNumber(), student);
            System.out.println("Студент добавлен в базу");
        }
    }

    @Override
    public String toString() {
        return "Institute{" +
                "studentSet=" + studentMap +
                '}';
    }


    public void printStudents() {
        String pattern = "%-15s%-15s%-15s%-15s%-30s%n";
        System.out.printf(pattern, "Фамилия", "Имя", "Отчество", "Номер группы", "Номер студенческого билета");
        for (Student student : studentMap.values()) {
            System.out.printf(pattern,
                    student.getFirstName(),
                    student.getSecondName(),
                    student.getThirdName(),
                    student.getGroupNumber(),
                    student.getDocNumber());

        }
    }
}
