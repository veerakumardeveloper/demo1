package org.jsp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class myContoller {

	
	@RequestMapping("/print")
	public ModelAndView myPrint(@RequestParam String name,@RequestParam String place) {
		
		System.out.println(name);
		System.out.println(place);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("print.jsp");
		
		mv.addObject("name",name);
		mv.addObject("place",place);
		
		return mv;
	}
	
	@RequestMapping("/result")
	public String result() {
		
		return "result.jsp";
	}
	
}
