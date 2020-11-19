package action;
import java.io.File;
import java.io.IOException;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

public class UploadAction extends ActionSupport{
private static final long serialVersionUID = 1L;
	
    private File image; //上传的文件
    private String imageFileName; //文件名称
    private String imageContentType; //文件类型
	
    public File getImage() {
		return image;
	}
	public void setImage(File image) {
		this.image = image;
	}
	public String getImageFileName() {
		return imageFileName;
	}
	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}
	public String getImageContentType() {
		return imageContentType;
	}
	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}
    
    public String upload() throws Exception{
    	String realpath = ServletActionContext.getServletContext().getRealPath("/images");
        System.out.println("realpath: "+realpath);
        if(image != null){
        	File savefile = new File(new File(realpath), imageFileName);
        	System.out.println(savefile);
        	System.out.println(savefile.getParentFile());
        	if(savefile.getParentFile().exists()){
        		try {
					savefile.getParentFile().mkdirs();
					FileUtils.copyFile(image, savefile);
				} catch (IOException e) {
					e.printStackTrace();
				}
        		ActionContext.getContext().put("message", "文件上传成功");
        	}
        }
        return "page";
    }
}
