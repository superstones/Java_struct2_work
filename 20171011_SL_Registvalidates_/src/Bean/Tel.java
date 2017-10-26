package Bean;

/**
 * Created by Administrator on 2017/10/16.
 */
public class Tel {
    private String sectionNo;
    private String telNo;

    @Override
    public String toString() {
        return  sectionNo + '-' + telNo ;
    }

    public String getSectionNo() {
        return sectionNo;
    }

    public void setSectionNo(String sectionNo) {
        this.sectionNo = sectionNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }
}
