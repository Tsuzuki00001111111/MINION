package jp.co.axiz.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.axiz.web.entity.LoginForm;
import jp.co.axiz.web.service.DeleteService;

@Controller
public class DeleteController {
	@Autowired
	private DeleteService service;
	
	@RequestMapping(value="/delete", method=RequestMethod.GET)
	public String getLogin(@ModelAttribute("LoginForm") LoginForm form, Model model) {
		return "delete";
	}

	
	@RequestMapping(value="/delete", method=RequestMethod.POST)
	public String postLogin(@ModelAttribute("LoginForm") LoginForm form, Model model) {
		String retJspVal = service.CallDao(form, model);

		return retJspVal;
	}
	@RequestMapping(value="/deleteConfirm", method=RequestMethod.POST)
	public String postLogin(@ModelAttribute("LoginForm") LoginForm form, Model model) {
		String retJspVal = service.CallDao(form, model);

		return retJspVal;
	}

}
