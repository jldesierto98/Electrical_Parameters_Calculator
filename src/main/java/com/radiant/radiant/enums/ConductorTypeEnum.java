package com.radiant.radiant.enums;

public enum ConductorTypeEnum {
    COPPER(1,"Copper",2.55),
    ALUMINUM(2,"Aluminum",4.99),
    ALOY(3,"Aloy",2.5);

    private int index;
    private String name;
    private Double resistivity;

    ConductorTypeEnum(int index, String type, Double resistivity) {
        this.index = index;
        this.name = type;
        this.resistivity = resistivity;
    }

    public static String getNameByIndex(Integer index) {
        for (ConductorTypeEnum value : ConductorTypeEnum.values()) {
            if (index.equals(value.getIndex())) {
                return value.getName();
            }
        }
        return null;
    }

    public static Double getResistivityByIndex(Integer index) {
        for (ConductorTypeEnum value : ConductorTypeEnum.values()) {
            if (index.equals(value.getIndex())) {
                return value.getResistivity();
            }
        }
        return null;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public Double getResistivity() {
        return resistivity;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setResistivity(Double resistivity) {
        this.resistivity = resistivity;
    }
}
