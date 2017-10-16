package Bean;


import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;


/**
 * Created by Administrator on 2017/10/16.
 */
public class AddressConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map arg0, String[] arg1, Class arg2 ) {
        System.out.println("String--->Address");

        Addresss addresss=new Addresss(arg1[0],arg1[1],arg1[2],arg1[3]);

        return addresss;
    }

    @Override
    public String convertToString(Map arg0, Object arg1) {
        System.out.println("Address--->String");
        Addresss address=(Addresss)arg1;
        return address.getProvince()+','+address.getCity()+','+address.getArea()+','+address.getStreet();
    }
}
