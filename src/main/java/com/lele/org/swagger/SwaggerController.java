package com.lele.org.swagger;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SwaggerController {
	@RequestMapping(value="/docs")
	public String index(){
		return "redirect:swagger-ui.html";
	}

}
