package com.radiant.radiant.enums;

public enum ConductorSizeEnum {

    GAUGE_16(1, "GAUGE 16", 1.5),

    GAUGE_14(2, "GAUGE 14", 2.5),

    GAUGE_12(3, "GAUGE 12", 4.0),

    GAUGE_10(4, "GAUGE 10", 6.0),

    GAUGE_8(5, "GAUGE 8", 10.0),

    GAUGE_6(6, "GAUGE 6", 16.0),

    GAUGE_4(7, "GAUGE 4", 25.0),

    GAUGE_2(8, "GAUGE 2", 35.0),

    GAUGE_1_0(9, "GAUGE 1/0", 50.0),

    GAUGE_2_0(10, "GAUGE 2/0", 70.0),

    GAUGE_250MCM(11, "250 MCM", 120.0),

    GAUGE_300MCM(12, "300 MCM", 150.0);


    private int index;
    private String name;
    private Double crossSectionalAreInMm;

    ConductorSizeEnum(int index, String name, Double crossSectionalAreInMm) {
        this.index = index;
        this.name = name;
        this.crossSectionalAreInMm = crossSectionalAreInMm;
    }


    public static String getNameByIndex(Integer index) {
        for (ConductorSizeEnum value : ConductorSizeEnum.values()) {
            if (index.equals(value.getIndex())) {
                return value.getName();
            }
        }
        return null;
    }

    public static Double getCrossSectionalAreaByIndex(Integer index) {
        for (ConductorSizeEnum value : ConductorSizeEnum.values()) {
            if (index.equals(value.getIndex())) {
                return value.getCrossSectionalAreInMm();
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

    public Double getCrossSectionalAreInMm() {
        return crossSectionalAreInMm;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCrossSectionalAreInMm(Double crossSectionalAreInMm) {
        this.crossSectionalAreInMm = crossSectionalAreInMm;
    }


}
