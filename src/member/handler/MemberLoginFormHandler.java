package member.handler;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import handler.CommandHandler;

@Controller  
public class MemberLoginFormHandler implements CommandHandler{
  @RequestMapping("/memberLoginForm")
  public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws Throwable{
	 System.out.println("로그인");
	  return new ModelAndView("member/memberLoginForm");  
  }
}
