package dao;
import model.User;
public interface IUserDao 
{
	public User checkUser(String name);
	public boolean saveUser(String name);
}
