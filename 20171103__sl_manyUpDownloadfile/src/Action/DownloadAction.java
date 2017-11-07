package Action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by idea on 2017/10/29.
 */
public class DownloadAction extends ActionSupport {
    private String inputPath;
    private String contentType;
    private String downFileName;

    public String getInputPath() {
        return inputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath=inputPath;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getDownFileName() throws UnsupportedEncodingException {
        return URLEncoder.encode(downFileName,"utf-8");
    }

    public void setDownFileName(String downFileName) {
        this.downFileName=downFileName;
    }
    public InputStream getTargetFile(){
        InputStream is = null;
        try {
            is = new FileInputStream(inputPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return is;
//        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
    }
}
