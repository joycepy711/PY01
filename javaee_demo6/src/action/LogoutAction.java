package action;
import java.util.Map;
import com.opensymphony.xwork2.ActionContext; 
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	public String logout() throws Exception{
		Map<String, Object> attibutes = ActionContext.getContext().getSession(); 
        attibutes.remove("user"); 
        System.out.println("已退出登录");
		return "logout";
	}
}