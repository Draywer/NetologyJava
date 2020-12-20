package ru.idcore.basejava.task0441.phonebook;

import java.util.*;

/**
 * Класс - Телефонный справочник
 */
public class PhonesBook {
    private static final String PATTERN = "%-20s%-20s%-100s%n";
    private static final String PATTERN_GROUP = "%-20s%-20s%n";

    private List<Contact> contacts;
    private List<Group> groups;
    private Map<Group, Set<Contact>> groupContacts;

    public PhonesBook() {
        contacts = new ArrayList<>();
        groups = new ArrayList<>();
        groupContacts = new HashMap<>();
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public Map<Group, Set<Contact>> getGroupContacts() {
        return groupContacts;
    }

    public Group addNewGroup(Scanner scanner) {
        int index;
        System.out.println("Введите название группы:");
        String newGroupName = scanner.nextLine();
        if (getGroupByName(newGroupName) == null) {
            Group newGroup = new Group(newGroupName);

            index = Collections.binarySearch(groups, newGroup);
            groups.add(Math.abs(index) - 1, newGroup);
            groupContacts.put(newGroup, new HashSet<>());

            System.out.println("Группа: " + newGroupName + " добавлена");
            return newGroup;
        } else {
            System.out.println("Группа: " + newGroupName + " есть в телефонном справочнике");
            return getGroupByName(newGroupName);
        }
    }

    public Contact addNewContact(Scanner scanner) {
        int index;

        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        System.out.println("введите номер телефона:");
        String phone = scanner.nextLine();

        Contact contact = new Contact(name, phone);
        if (getContact(contact) == null) {
            index = Collections.binarySearch(getContacts(), contact);
            getContacts().add(Math.abs(index) - 1, contact);

            while (true) {
                System.out.println("Добавить контакт в группы (да/нет)?");
                String input = scanner.nextLine();
                if (input.equals("да")) {
                    addContactInGroup(scanner, contact);
                    break;
                } else if (input.equals("нет")) {
                    System.out.println("Контакт " + contact + " не содеожится ни в одной группе");
                    break;
                }
            }
            return contact;
        } else if (getContact(contact).equals(contact)) {
            System.out.println("Контакт: " + contact + " есть в телефонном справочнике");
            return getContact(contact);
        }
        return null;
    }


    public void addContactInGroup(Scanner scanner, Contact contact) {

        try {
            System.out.println("Введите названия групп через пробел (Например: Работа Семья Друзья): ");
            String groups = scanner.nextLine();
            String[] contactGroup = groups.split(" ");

            for (int i = 0; i < contactGroup.length; i++) {
                if (getGroupByName(contactGroup[i]) != null) {
                    groupContacts.get(getGroupByName(contactGroup[i])).add(contact);
                    System.out.println("Контакт добавлен в группу: " + contactGroup[i]);
                } else {
                    while (true) {
                        System.out.println("Группа: " + contactGroup[i] + " отсутствует в телефонном мправочнике. Добавить группу (да/нет)? ");
                        String input = scanner.nextLine();
                        if (input.equals("да")) {
                            Group newContactGroup = addNewGroup(scanner);
                            groupContacts.get(newContactGroup).add(contact);
                            System.out.println("Контакт добавлен в группу: " + newContactGroup);
                            break;
                        } else if (input.equals("нет")) {
                            break;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Некорректный формат перечисления групп: " + groups);
        }
    }

    public void deleteContactFromGroup(Group group, Contact contact) {
        groupContacts.get(group).remove(contact);
    }

    public Group getGroupByName(String groupName) {
        for (Group group : groups) {
            if (group.getName().equals(groupName)) {
                return group;
            }
        }
        return null;
    }

    public Contact getContact(Contact contact) {
        if (!contacts.isEmpty()) {
            for (Contact currentContact : contacts) {
                if (currentContact.equals(contact)) {
                    return currentContact;
                }
            }
        }
        return null;
    }

    public ArrayList<Group> getContactGroup(Contact contact) {
        ArrayList<Group> groups = new ArrayList<>();

        for (Group group : groupContacts.keySet()) {
            for (Contact contacts : groupContacts.get(group)
            ) {
                if (contacts.equals(contact)) {
                    groups.add(group);
                }
            }
        }
        return groups;
    }


    public void printPhoneBookByContact() {
        System.out.printf(PATTERN, "Имя", "Номер телефона", "Группа");
        for (Contact contact : contacts) {
            System.out.printf(PATTERN, contact.getName(), contact.getPhone(), getContactGroup(contact));
        }
    }

    public  void printPhoneBookByGroup(Group group) {
        Set<Contact> contacts = groupContacts.get(group);

        System.out.println(group);
        System.out.printf(PATTERN_GROUP, "Имя", "Номер телефона");
        for (Contact contact: contacts) {
            System.out.printf(PATTERN_GROUP, contact.getName(), contact.getPhone());
        }
    }

    public void printPhoneGroup() {
        for (Group group : groupContacts.keySet()) {
            printPhoneBookByGroup(group);
            System.out.println("\n");
        }
    }

}
