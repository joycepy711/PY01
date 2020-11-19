package action;
import model.User;
import com.opensymphony.xwork2.ActionSupport;
import dao.IUserDao;
import dao.UserDao;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String login() throws Exception
	{
    	boolean checked = false;
    	IUserDao userDao = new UserDao();
    	User user = userDao.checkUser(getName());
    	System.out.println(getName());
        if(user != null)
        	checked = true;
        if(checked) 
            return "logsuccess";
        else
            return "logfail";
    }
    public String logup() throws Exception
    {
    	IUserDao userDao = new UserDao();
    	boolean saved = userDao.saveUser(getName());
    	if(saved)
    		return "regsuccess";
    	else
    		return "regfail";
    }
}
