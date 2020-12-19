package ru.idcore.basejava.task0151;

import java.util.Calendar;
import java.util.GregorianCalendar;
import ru.idcore.basejava.task0152.Text;

public class Task {
    public String name;
    String period;
    public Calendar startDate;
    public Calendar endDate;

    public Task() {
        this.name = Text.extraTrimString(Text.trimString(Dialog.getStringFromConsole()));
        this.startDate = getDataFromName("начинается в");
        this.endDate = getDataFromName("заканчивается в");
        this.period = getPeriodTask();
    }

    public String toString() {
        String str;
        str = "Название задачи: " + this.name +
                "\nВремя начала выполнения задачи: " + startDate.getTime() +
                "\nВремя окончания выполнения задачи: " + endDate.getTime() +
                "\nДлительность задачи: " + period;
        return str;
    }

    public Calendar getDataFromName(String substring) {
        GregorianCalendar calendar;
        int dateTimeStringIndex = this.name.indexOf(substring) + substring.length() + 1;
        int day = Integer.parseInt(name.substring(dateTimeStringIndex, dateTimeStringIndex + 2));
        int months = Integer.parseInt(name.substring(dateTimeStringIndex + 3, dateTimeStringIndex + 5));
        int year = Integer.parseInt(name.substring(dateTimeStringIndex + 6, dateTimeStringIndex + 10));
        int hours = Integer.parseInt(name.substring(dateTimeStringIndex + 11, dateTimeStringIndex + 13));
        int minutes = Integer.parseInt(name.substring(dateTimeStringIndex + 14, dateTimeStringIndex + 16));
        int seconds = Integer.parseInt(name.substring(dateTimeStringIndex + 17, dateTimeStringIndex + 19));

        calendar = new GregorianCalendar(year, months - 1, day, hours, minutes, seconds);
        return calendar;
    }

    public static void printTaskInfo() {
        Dialog.printCommand("ВНИМАНИЕ! \nВремя должно вводиться в формате: dd.mm.yyyy hh:mm:ss");
        Dialog.printCommand("Перед временем начала задачи должна быть фраза \"начинается в \"");
        Dialog.printCommand("Перед временем окончания задачи должна быть фраза \"заканчивается в \"");
        Dialog.printCommand("(Пример: Задача № 1 начинается в 12.09.2020 12:00:00 и заканчивается в 15.10.2020 15:00:00)");
        Dialog.printCommand("\n\nВведитите название задачи и время выполнения:");
    }

    public String getPeriodTask() {
        long seconds;
        long days;
        long hours;
        long minutes;
        String result;

        seconds = (this.endDate.getTimeInMillis() - this.startDate.getTimeInMillis());

        days = seconds / (24 * 60 * 60 * 1000);
        hours = (seconds % (24 * 60 * 60 * 1000)) / (60 * 60 * 1000);
        minutes = ((seconds % (24 * 60 * 60 * 1000)) % (60 * 60 * 1000)) / (60 * 1000);

        result = "Количество дней: " + days + ", Количество часов: " + hours + ", Количество минут: " + minutes;

        return result;
    }

    public boolean isNegative() {
        long result;

        result = (this.endDate.getTimeInMillis() - this.startDate.getTimeInMillis());
        if (result < 0) {
            return true;
        } else {
            return false;
        }
    }
}
