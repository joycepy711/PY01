package interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;

import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class LoginInterceptor  extends MethodFilterInterceptor{
	private static final long serialVersionUID = 1L; 
	 protected String doIntercept(ActionInvocation invocation) throws Exception {  
		 ActionContext context = invocation.getInvocationContext();
			Map<String, Object> session = context.getSession();
			Object object = session.get("username"); // 判断用户是否登录
			if(object==null){
				System.out.println("请重新登录");
				return "login";
			}
			String invoke = invocation.invoke(); // 登录则放行
			return invoke;
	    }
}
