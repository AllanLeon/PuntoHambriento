public class Location {
    
    private int id;
    private String address;
    private float latitude;
    private float longitude;
    private int phone;
    
    public Location(){}
    
    public Location(String address, float latitude, float longitude, 
                    int phone) {
        super();
        this.address = address;
        this.latitude= latitude;
        this.longitude = longitude;
        this.phone = phone;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {   
        this.id = id;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public float getLatitude() {
        return latitude;
    }
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    public float getLongitude() {
        return longitude;
    }
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    public int getPhone() {
        return phone;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString() {
        return "Location [id=" + id + ", address=" + address+ ", latitude=" 
           + latitude + ", longitude=" + longitude + ", phone=" + phone 
           + "]";
 }
}