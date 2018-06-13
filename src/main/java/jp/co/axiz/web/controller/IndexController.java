package jp.co.axiz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String index(Model model) {
		return "index";
	}

	@RequestMapping(value="/menu", method=RequestMethod.GET)
	public String menu(Model model) {

		if(model != null) {
			return "menu";
		}else {
			return "redirect:index";
		}
	}

}
