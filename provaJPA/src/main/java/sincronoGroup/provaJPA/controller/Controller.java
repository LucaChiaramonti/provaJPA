package sincronoGroup.provaJPA.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import sincronoGroup.provaJPA.model.*;


@org.springframework.stereotype.Controller
public class Controller 
{
	@Autowired
	StudenteUtil sU;
	List<Studente> studenti=null;
	@RequestMapping(value = "/trovaTutti", method = RequestMethod.GET)
	public String trovaTutti(Model model) 
	{
		studenti=sU.findAll();
		model.addAttribute("studenti", studenti);
		return "other/seconda";
	}
	
	@RequestMapping(value = "/trovaPerNome", method = RequestMethod.GET)
	public String trovaPerNome(@RequestParam String nome,Model model) {
		
		studenti = sU.findByName(nome);
		model.addAttribute("studenti", studenti);
		return "other/seconda";
	}
	
	@RequestMapping(value = "/trovaPerCognome", method = RequestMethod.GET)
	public String trovaPerCognome(@RequestParam String cognome,Model model) {
		
		studenti = sU.findByCognome(cognome);
		model.addAttribute("studenti", studenti);
		return "other/seconda";
	}
	@RequestMapping(value = "/aggiungiStudente", method = RequestMethod.GET)
	public String aggiungiStudente(@RequestParam String nome,@RequestParam String cognome,Model model) {
		
		sU.aggiungiStudente(nome, cognome);
		return "index";
	}

}
