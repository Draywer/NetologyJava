package ru.idcore.basejava.task0443.transport;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TransportDataBase {
    private Map<String, Transport> transportDb;

    public TransportDataBase() {
        transportDb = new HashMap<>();
    }

    public Transport addTransport(Scanner scanner) {
        System.out.println("Введите информацию об автомобиле в формате: [номер] [марка] [цвет] [тип автомобиля])");
        String number = scanner.next();
        String model = scanner.next();
        String color = scanner.next();
        String type = scanner.next();
        if (transportDb.containsKey(number)) {
            System.out.println("Ввод данных отменен. В БД зарегистрирован транспорт с номером: " + number);
            return transportDb.get(number);
        } else {
            Transport transport;
            switch (type) {
                case "Легковой":
                    transport = new Car(model, number, color);
                    break;
                case "Грузовой":
                    transport = new Track(model, number, color);
                    transportDb.put(transport.getNumber(), transport);
                    break;
                case "Автобус":
                    transport = new Bus(model, number, color);
                    transportDb.put(transport.getNumber(), transport);
                    break;
                case "Грузо-пассажирский":
                    transport = new CargoPassenger(model, number, color);
                    transportDb.put(transport.getNumber(), transport);
                    break;
                case "Спецтранспорт":
                    transport = new Special(model, number, color);
                    transportDb.put(transport.getNumber(), transport);
                    break;
                default:
                    throw new IllegalStateException("Неизвестный тип: " + type);
            }
            transportDb.put(transport.getNumber(), transport);
            return transport;
        }

    }

    public void printTransportGroupType(String type) {
        String pattern = "%-15s%-15s%-15s%n";
        System.out.println(getTypeName(type));
        System.out.printf(pattern, "Номер", "Модель", "Цвет");
        for (Transport transport: transportDb.values()) {
            if (transport.getType().equals(type)) {
                System.out.printf(pattern, transport.getNumber(), transport.model, transport.getColor());
            }
        }
        System.out.println("\n");
    }

    private String getTypeName(String type) {
        String result = null;
        switch (type) {
            case "Легковой":
                result = "Легковые автомобили";
                break;
            case "Грузовой":
                result = "Грузовые автомобили";
                break;
            case "Автобус":
                result = "Автобусы";
                break;
            case "Грузо-пассажирский":
                result = "Грузо-пассажирский транспорт";
                break;
            case "Спецтранспорт":
                result = "Спецтранспорт";
                break;
            default:
                throw new IllegalStateException("Неизвестный тип: " + type);
        }
        return result;
    }

    public void printAllTransportGroup() {
        printTransportGroupType("Легковой");
        printTransportGroupType("Грузовой");
        printTransportGroupType("Автобус");
        printTransportGroupType("Грузо-пассажирский");
        printTransportGroupType("Спецтранспорт");
    }

    public void printTypeTransport() {
        System.out.println("Типы транспортных стредств:");
        System.out.println("Легковой");
        System.out.println("Грузовой");
        System.out.println("Автобус");
        System.out.println("Грузо-пассажирский");
        System.out.println("Спецтранспорт");

    }
}
