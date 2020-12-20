package ru.idcore.basejava.task0431.house;

public class House {
    private final int countFloor;
    private final Floor[] floors;
    private Lift lift;

    public House(int countFloor, Lift lift) {
        this.countFloor = countFloor;
        this.floors = new Floor[this.countFloor];

        for (int i = 0; i < floors.length; i++) {
            floors[i] = new Floor(i);
        }

        this.lift = lift;
    }

    public int getCountFloor() {
        return countFloor;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public Lift getLift() {
        return lift;
    }

    public void setLift(Lift lift) {
        this.lift = lift;
    }

    @Override
    public String toString() {
        return "\nДом:" +
                "\nКоличество этажей = " + countFloor + "\n" + lift;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        House house = (House) o;

        return countFloor == house.countFloor && lift.equals(house.getLift());
    }

}
