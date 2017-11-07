package Action;

import Bean.Path;
import DB.PathDao;
import com.opensymphony.xwork2.ActionSupport;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Created by idea on 2017/10/23.
 */
public class UploadAction extends ActionSupport {
    private String title;
    private File[] upload;
    private String[] uploadContentType;
    private String[] uploadFileName;
    private String savePath;
    private List<Path> paths;

    public String getSavePath() {
        return savePath;
    }

    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
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

    public File[] getUpload() {
        return upload;
    }

    public void setUpload(File[] upload) {
        this.upload = upload;
    }

    public String[] getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String[] uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String[] getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String[] uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String uploadMethod(){

        PathDao pathDao = new PathDao();
        for (int i=0;i<uploadFileName.length;i++) {
            System.out.println(upload[i]);
            System.out.println(uploadContentType[i]);
            System.out.println(uploadFileName[i]);
            try {
                FileInputStream fis = new FileInputStream(upload[i]);
                String newFileName = UUID.randomUUID().toString() + "_" + uploadFileName[i];
//                Path path = new Path(newFileName,uploadContentType[i],uploadFileName[i]);
                Path path = new Path();
                path.setSaveFileName(newFileName);
                path.setUploadContentType(uploadContentType[i]);
                path.setUploadFileName(uploadFileName[i]);
                pathDao.add(path);
                FileOutputStream fos = new FileOutputStream(savePath + newFileName);
                byte[] buffer = new byte[1024];
                int len;
                while ((len = fis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return "uploadOK";
    }

    public String uploadList(){

        PathDao pathDao = new PathDao();
        setPaths(pathDao.paths());
        return "uploadListOK";
    }
}
