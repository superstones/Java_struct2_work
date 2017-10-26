package Bean;


import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by Administrator on 2017/10/16.
 */
public class TelConverter extends StrutsTypeConverter {

    @Override
    public Object convertFromString(Map arg0, String[] arg1, Class arg3) {
        System.out.println("String---->Tel");
        String str = arg1[0];
        String[] parame = str.split("-");
        Tel tel = new Tel();
        tel.setSectionNo(parame[0]);
        tel.setTelNo(parame[1]);
        return tel;
    }

    @Override
    public String convertToString(Map arg0, Object arg1) {
        System.out.println("Tel---->String");
        Tel tel=(Tel) arg1;
        return tel.getSectionNo()+'-'+tel.getTelNo();
    }
}
