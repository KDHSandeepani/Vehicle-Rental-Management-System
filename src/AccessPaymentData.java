
public class AccessPaymentData {
    private final String payment_id;
    private final String recite_number;
    private final String number_plate;
    private final String vehicle_name;
    private final String customer_name;
    private final String customer_nic;
    private final String vehicle_rent_date;
    private final String vehicle_retured_date;
    private final String payment;

    public AccessPaymentData(String payment_id, String recite_number, String number_plate, String vehicle_name, String customer_name, String customer_nic, String vehicle_rent_date, String vehicle_retured_date, String payment) {
        this.payment_id = payment_id;
        this.recite_number = recite_number;
        this.number_plate = number_plate;
        this.vehicle_name = vehicle_name;
        this.customer_name = customer_name;
        this.customer_nic = customer_nic;
        this.vehicle_rent_date = vehicle_rent_date;
        this.vehicle_retured_date = vehicle_retured_date;
        this.payment = payment;
    }

    public String getPayment_id() {
        return payment_id;
    }

    public String getRecite_number() {
        return recite_number;
    }

    public String getNumber_plate() {
        return number_plate;
    }

    public String getVehicle_name() {
        return vehicle_name;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public String getCugstomer_nic() {
        return customer_nic;
    }

    public String getVehicle_rent_date() {
        return vehicle_rent_date;
    }

    public String getVehicle_retured_date() {
        return vehicle_retured_date;
    }

    public String getPayment() {
        return payment;
    }

    
}
