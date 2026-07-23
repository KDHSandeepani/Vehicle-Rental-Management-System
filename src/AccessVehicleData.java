
public class AccessVehicleData {

    private final String id;
    private final String numberplate;
    private final String brand;
    private final String name;
    private final String year;
    private final String colour;
    private final String fualtype;
    private final String transmission;
    private final String dhprice;
    private final String status;

    public AccessVehicleData(String id, String numberplate, String brand, String name, String year, String colour, String fualtype, String transmission, String dhprice, String status) {
        this.id = id;
        this.numberplate = numberplate;
        this.brand = brand;
        this.name = name;
        this.year = year;
        this.colour = colour;
        this.fualtype = fualtype;
        this.transmission = transmission;
        this.dhprice = dhprice;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public String getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public String getFualtype() {
        return fualtype;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getDhprice() {
        return dhprice;
    }

    public String getStatus() {
        return status;
    }
    
}
