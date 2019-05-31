package sincronoGroup.provaJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import sincronoGroup.provaJPA.model.*;


@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	StudenteUtil sU;
	List<Studente> studenti=null;
	@RequestMapping(value = "/studenti", method = RequestMethod.GET)
	public String attori(Model model) {
		// JPA
		//studenti = sU.findByName("Luca");
		studenti=sU.findAll();
		model.addAttribute("studenti", studenti);
		return "other/seconda";
	}
}
