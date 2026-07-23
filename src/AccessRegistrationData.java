
public class AccessRegistrationData {
    private final String id;
    private final String nic;
    private final String name;
    private final String address;
    private final String phonenumber;

    public AccessRegistrationData(String id, String nic, String name, String address, String phonenumber) {
        this.id = id;
        this.nic = nic;
        this.name = name;
        this.address = address;
        this.phonenumber = phonenumber;
    }

    public String getId() {
        return id;
    }

    public String getNic() {
        return nic;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }   
}
