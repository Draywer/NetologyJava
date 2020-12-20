package ru.idcore.basejava.task0431.house;

import java.util.ArrayDeque;
import java.util.Queue;

/*Класс - Лифт*/
public class Lift {
    private final int waitDoorsInSeconds;
    private final int speed;
    private int totalTime;
    private Queue<Floor> floorQueue;

    public Lift(int speed, int waitDoorsInSeconds) {
        this.speed = speed;
        this.waitDoorsInSeconds = waitDoorsInSeconds;
        this.totalTime = 0;
        this.floorQueue = new ArrayDeque<>();
    }

    public int getWaitDoorsInSeconds() {
        return waitDoorsInSeconds;
    }

    public int getSpeed() {
        return speed;
    }

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void addFloor(Floor floor) {
        floorQueue.offer(floor);
    }

    public int getTimeMove(Floor floorFrom, Floor floorTo) {
        return floorFrom.equals(floorTo) ? 0 : Math.abs(floorFrom.getFloor() - floorTo.getFloor()) * speed + waitDoorsInSeconds;
    }

    public void executeQueue() {
        int totalTimeMove = 0;

        if (floorQueue.size() > 0) {
            Floor currentFloor = floorQueue.peek();
            while (floorQueue.peek() != null) {
                Floor destinationFloor = floorQueue.poll();
                System.out.print(destinationFloor);
                if (floorQueue.peek() != null) {
                    System.out.print(" -> ");
                }
                totalTimeMove += getTimeMove(currentFloor, destinationFloor);
                currentFloor = destinationFloor;
            }
        }
        totalTime += totalTimeMove;
        System.out.println();
        System.out.println("Время, затраченное лифтом на маршрут: " + totalTimeMove + " cек.");
    }

    @Override
    public String toString() {
        return "\nЛифт:" +
                "\nВремя открытия дверей = " + waitDoorsInSeconds + " cек." +
                "\nСкорость  = " + speed + " cек./этаж" +
                "\nОбщее время работы = " + totalTime + " сек.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lift lift = (Lift) o;
        return waitDoorsInSeconds == lift.waitDoorsInSeconds && speed == lift.speed;
    }

}
