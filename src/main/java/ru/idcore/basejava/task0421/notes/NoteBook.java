package ru.idcore.basejava.task0421.notes;

import java.util.ArrayList;
import java.util.Scanner;

public class NoteBook {
    protected ArrayList<Task> tasks;
    protected ArrayList<Menu> menus;

    public NoteBook() {
        tasks = new ArrayList<>();
        menus = new ArrayList<>();
        createMenu();
    }

    public void addTask(String taskName) {
        tasks.add(new Task(taskName));
    }

    public boolean addTasks(Scanner scanner) {
        while (true) {
            String input = getTaskName(scanner);
            if (!input.equals("end")) {
                addTask(input);
            } else {
                printTask();
                break;
            }
        }
        return true;
    }


    public void printTask() {
        if (tasks.size() > 0) {
            String pattern = "%-5s%-25s%n";
            System.out.println("\nСписок задач:");

            for (int i = 0; i < tasks.size(); i++) {
                System.out.printf(pattern, i + 1, tasks.get(i).getName());
            }
        } else {
            System.out.println("\nСписок задач пустой");
        }
    }

    public void deleteTask(int indexTask) {
        tasks.remove(indexTask);
    }

    public boolean deleteTasks(Scanner scanner) {
        while (true) {
            if (tasks.size() > 0) {
                printTask();
                String input = getTaskIndex(scanner);
                if (!input.equals("finish")) {
                    try {
                        int taskIndex = Integer.parseInt(input);
                        if (!tasks.isEmpty()) {
                            if (tasks.get(taskIndex - 1) != null) {
                                deleteTask(taskIndex - 1);
                                System.out.println("\nЗадача удалена");
                            }
                        }
                    } catch (Exception e) {
                        System.out.println("Введен некорректный код: " + input);
                    }
                } else {
                    printTask();
                    break;
                }
            } else {
                System.out.println("Список задач пустой");
                break;
            }
        }
        return true;
    }

    protected void createMenu() {
        menus.add(Menu.MENU_ADD);
        menus.add(Menu.MENU_PRINT_ALL);
        menus.add(Menu.MENU_DELETE);
        menus.add(Menu.MENU_EXIT);
    }

    public void printMenu() {
        String pattern = "%-5s%-25s%n";

        System.out.println("\nВыберете действие:");
        for (Menu menu : menus) {
            System.out.printf(pattern, menu.getKey() + ".", menu.getTitle());
        }

    }

    protected String getTaskName(Scanner scanner) {
        System.out.println("Введите название задачи (для выхода введите end)");
        return scanner.nextLine();
    }

    protected String getTaskIndex(Scanner scanner) {
        System.out.println("Введите код задачи для удаления (для выхода введите finish)");
        return scanner.nextLine();
    }


}
