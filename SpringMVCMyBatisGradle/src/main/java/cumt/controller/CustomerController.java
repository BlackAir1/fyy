package cumt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import cumt.domain.Customer;
import cumt.service.CustomerService;


@Controller
public class CustomerController {
	@Autowired
	@Qualifier("customerService")
	private CustomerService customerService;
	//顾客注册
	@RequestMapping("/customerRegister")
	public String customerRegister(Customer customer,Model m){
		customerService.register(customer);
		m.addAttribute("success", "注册成功！请登录！");
		return "loginForm";
		
	}
	
	//顾客登录
	@RequestMapping("/customerLogin")
	public ModelAndView customerLogin (String name,String password,
			ModelAndView mv,HttpSession session
			){
		int i=1;
		Customer customer = customerService.login(name, password);
		if(customer!=null){
			
			i++;
			session.setAttribute("name", customer.getName());
			session.setAttribute("num", i);
			mv.setView(new RedirectView("/SpringMVCMyBatisGradle/showgood"));
		}else{
			mv.addObject("message", "用户名或密码错误！");
			mv.setViewName("loginForm");
		}
		return mv;
	}
	
	
	

}
