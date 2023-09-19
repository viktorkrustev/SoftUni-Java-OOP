package InterfacesAndAbstractionLab.CarShop_01;

import InterfacesAndAbstractionLab.CarShop_01.Car;

public class Seat implements Car {
    private String model;
    private String color;
    private Integer horsePower;
    private String countryProduced;

    public Seat(String model, String color, Integer HP, String country) {
        this.model = model;
        this.color = color;
        this.horsePower = HP;
        this.countryProduced = country;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public Integer getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String countryProduced() {
        return this.countryProduced;
    }

    public String toString(){
        return String.format("This is %s produced in %s and have %d tires",getModel(),countryProduced(), Car.TIRES);
    }
}
