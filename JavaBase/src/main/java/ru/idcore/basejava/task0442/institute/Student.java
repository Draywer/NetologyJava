package ru.idcore.basejava.task0442.institute;

import java.util.Objects;

public class Student {
    private String firstName;
    private String secondName;
    private String thirdName;
    private final String docNumber;
    private String groupNumber;

    public Student(String firstName,
                   String secondName,
                   String thirdName,
                   String docNumber,
                   String groupNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.docNumber = docNumber;
        this.groupNumber = groupNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", docNumber='" + docNumber + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getDocNumber().equals(student.getDocNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDocNumber());
    }
}
