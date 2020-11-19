package filter;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class LoginFilter extends HttpServlet implements Filter
{
	private static final long serialVersionUID = 1L;
	public void destroy(){}
	public void doFilter(ServletRequest srq, ServletResponse srp, FilterChain filterChain) throws IOException, ServletException
	{	         
		HttpServletRequest request = (HttpServletRequest) srq;     
	    HttpServletResponse response = (HttpServletResponse) srp;     
	    HttpSession session = request.getSession();     
	    String url=request.getServletPath(); 
	    String contextPath=request.getContextPath(); 
	    if(url.equals("")) url+="/"; 
	    if((url.startsWith("/")&&!url.startsWith("/login.jsp")))
	    {
		    String username=(String)session.getAttribute("username"); 
		    if(username==null)
		    {
		    	response.sendRedirect(contextPath+"/login.jsp");
	            return; 
	        } 
	    } 
	    filterChain.doFilter(srq, srp);   
	} 
	public void init(FilterConfig arg0) throws ServletException {}
}
