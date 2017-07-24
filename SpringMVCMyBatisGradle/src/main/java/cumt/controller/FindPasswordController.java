package cumt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cumt.domain.Customer;
import cumt.service.CustomerService;

@Controller
public class FindPasswordController {
	@Autowired
	@Qualifier("customerService")
	private CustomerService customerService;
	
	//邮箱找回密码
	@RequestMapping(value="/find",method = RequestMethod.POST)
		public ModelAndView find(
			String name,String email,
			ModelAndView mv
			)throws Exception{	
				
		   Customer user = customerService.findPassword(name,email);

			if(user!=null){
				
				StringBuffer url = new StringBuffer();
				StringBuilder builder = new StringBuilder();
				// 正文
				builder.append(
						"<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" /></head><body>");
				url.append("<font color='red'>" + user.getPassword() + "</font>");
				builder.append("<br/><br/>");
				builder.append("<div>" + url + "</div>");
				builder.append("</body></html>");
				SimpleEmail sendemail = new SimpleEmail();
				sendemail.setHostName("smtp.163.com"); 

 

				// 指定要使用的邮件服务器
				sendemail.setAuthentication("15162185220@163.com", "147258wangdi");// 使用163的邮件服务器需提供在163已注册的用户名、shouquan
				sendemail.setCharset("UTF-8");
				try {
					sendemail.setCharset("UTF-8");
					sendemail.addTo(email);
					sendemail.setFrom("15162185220@163.com");
					sendemail.setSubject("找回密码");
					sendemail.setMsg(builder.toString());
					sendemail.send();
					System.out.println(builder.toString());
				} catch (EmailException e) {
					e.printStackTrace();
				}
				mv.addObject("message", "找回密码成功，请登录！！");
				mv.setViewName("loginForm");
				return mv;
			}else{
				mv.addObject("message", "邮箱或用户名错误！！");
				mv.setViewName("findPassword");
			}
		    return mv;
		}


}
