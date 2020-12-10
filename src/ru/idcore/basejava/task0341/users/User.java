package ru.idcore.basejava.task0341.users;

public class User {
    private String login;
    private String password;
    private String email;
    private int age;

    public User() {

    }

    public User(String login, String password, String email, int age) {
        this.login = login;
        this.password = password;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nLogin: " + login +
                "\nPassword: " + password +
                "\nEmail: " + email +
                "\nAge: " + age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        User user = (User) object;

        return login.equals(user.login) &&
                password.equals(user.password) &&
                email.equals(user.email) &&
                age == user.age;
    }
}
