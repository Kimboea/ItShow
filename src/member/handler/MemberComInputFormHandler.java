package member.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberComInputFormHandler {
  @RequestMapping("/memberComInputForm")
  public ModelAndView process(HttpServletRequest request, HttpServletResponse response) throws Throwable{
	 return new ModelAndView("member/memberComInputForm");
  }
}
