package Bean;

/**
 * Created by Administrator on 2017/10/16.
 */
public class Addresss {
    private String province;
    private String city;

    @Override
    public String toString() {
        return province+','+city+','+area+','+street;
    }

    private String area;
    private String street;

    public Addresss(String province, String city, String area, String street) {
        this.province = province;
        this.city = city;
        this.area = area;
        this.street = street;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
