
public class AccessInsuranceData {
    private final String insurance_id; 
    private final String numberplate;
    private final String insurance_number;
    private final String insurance_company;
    private final String insurance_date;
    private final String insurance_expdate;

    public AccessInsuranceData(String insurance_id, String numberplate, String insurance_number, String insurance_company, String insurance_date, String insurance_expdate) {
        this.insurance_id = insurance_id;
        this.numberplate = numberplate;
        this.insurance_number = insurance_number;
        this.insurance_company = insurance_company;
        this.insurance_date = insurance_date;
        this.insurance_expdate = insurance_expdate;
    }

    public String getInsurance_id() {
        return insurance_id;
    }

    public String getNumberplate() {
        return numberplate;
    }

    public String getInsurance_number() {
        return insurance_number;
    }

    public String getInsurance_company() {
        return insurance_company;
    }

    public String getInsurance_date() {
        return insurance_date;
    }

    public String getInsurance_expdate() {
        return insurance_expdate;
    }
    
}
