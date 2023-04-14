package web.model;

public class Cars {
    private String model;
    private String manufacturingСountry;
    private Long yearOfRealease;

    public Cars(String model, String manufacturingСountry, Long yearOfRealease) {
        this.model = model;
        this.manufacturingСountry = manufacturingСountry;
        this.yearOfRealease = yearOfRealease;
    }

    @Override
    public String toString() {
        return "model='" + model + '\'' +
                ", manufacturing Country='" + manufacturingСountry + '\'' +
                ", year Of Release=" + yearOfRealease;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturingСountry() {
        return manufacturingСountry;
    }

    public void setManufacturingСountry(String manufacturingСountry) {
        this.manufacturingСountry = manufacturingСountry;
    }

    public Long getYearOfRealease() {
        return yearOfRealease;
    }

    public void setYearOfRealease(Long yearOfRealease) {
        this.yearOfRealease = yearOfRealease;
    }
}

