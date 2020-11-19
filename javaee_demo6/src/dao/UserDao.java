package dao;
import model.User;
import addHibernateFile.HibernateSessionFactory;
import java.util.List;
import java.util.Map;
import org.hibernate.Transaction;
import org.hibernate.Session;
import com.opensymphony.xwork2.ActionContext;
import org.hibernate.query.Query;
public class UserDao implements IUserDao
{
    public User checkUser(String name)//登录
    {  	
    	Session session=HibernateSessionFactory.getSession();
        	 Transaction ts=session.beginTransaction();
        	 //在HQL查询中使用delete进行批量删除
        	 Query query=session.createQuery("delete from User u where u.name=?");
        	 query.executeUpdate();
        	 ts.commit();
             HibernateSessionFactory.closeSession();
             return null;
    }
    public boolean saveUser(String username)//注册
    {
    	String sql = "from User u where u.username=?";
    	Query query=HibernateSessionFactory.getSession().createQuery(sql);
        query.setParameter(0, username);
        List users=query.list();
        if(users.size()!=0) {
            return false;
        }
        else{
        	Session session = HibernateSessionFactory.getSession();
        	Transaction transaction = session.beginTransaction();
        	User user = new User();
        	user.setUsername(username);
        	session.save(user);
        		transaction.commit();
        	session.close();
            return true;
        }
    }
}
