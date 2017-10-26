package Action;

import Bean.User;
import Dao.UserDao;
import Services.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/10/11.
 */
public class registAction extends ActionSupport implements ModelDriven<User> {
    private String title;
    private File upload;
    private String uploadContentType;
    private String uploadFileName;
    private String savePath;

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

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath;
    }

    User u = new User();
      UserDao userDao=new UserDao();
       UserService uService =new UserService();

    String Code2 = (String) ActionContext.getContext().getSession().get("checkCode");
    @Override
    public User getModel() {
        return u;

    }
    @Override
    public void validate() {
        System.out.println("进入注册Validate");
        if (u.getUsername() == null || u.getUsername().trim().equals("")) {
            this.addFieldError("usernameError", "用户名不能为空");
        }
        if (u.getPassword() == null || u.getPassword().trim().equals("")) {
            this.addFieldError("passwordError", "密码不能为空");

        }
    }
    public String registMethod(){
        ActionContext.getContext().getSession().put("user",u);

     userDao.addUser(u);
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

        return "registOK";

    }




}


