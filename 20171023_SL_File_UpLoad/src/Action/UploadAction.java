package Action;

import com.opensymphony.xwork2.ActionSupport;

import java.io.*;
import java.util.UUID;

/**
 * Created by Administrator on 2017/10/23.
 */
public class UploadAction extends ActionSupport {
    private String title;
    private File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String savePath;

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String upload() {
        //了解三个参数的含义
        System.out.println(upload);
        System.out.println(uploadContentType);
        System.out.println(uploadFileName);
        //完成上传(Java I/O流的字节流)
        try {
            FileInputStream fis = new FileInputStream(upload);
            String newFileName = UUID.randomUUID().toString()+"_"+uploadFileName;
            FileOutputStream fos = new FileOutputStream(savePath + "/" + newFileName);
            byte[] buffer =new byte[1024];
            int len=0;
            while ((len=fis.read(buffer))>0){
                fos.write(buffer,0,len);

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "uploadOK";


    }

}
