package com.epsilon.com.web;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.epsilon.com.dao.SimplonRepository;
import com.epsilon.com.entities.Simplon;

@Controller
public class SimplonController {
	
	@Autowired
	private SimplonRepository simplonRepository;
	
@GetMapping("/epsilon")
public String homepage(Model model) {
	model.addAttribute("simplonList", simplonRepository.findAll());
	return "home";
	
	
}

 @GetMapping("deleteSimplon/{id}")
public String delete(@PathVariable("id") int id) {
	simplonRepository.deleteById(id);
	
	return "redirect:/epsilon";
	
}
 
 @GetMapping("/ajouter")
public String ajout(Model model) {
	 Simplon s =new Simplon();
	 model.addAttribute("simplon", s);
	 return "ajouter";
	
}
 
@PostMapping("/enregistrement")
public String enregistrer(@ModelAttribute("simplon") Simplon simplon) {
	simplonRepository.save(simplon);
	return "redirect:/epsilon";
	
}

@GetMapping("/updateSimplon/{id}")

public String Update(@PathVariable("id") int id ,Model model) {
	Optional<Simplon> temp=simplonRepository.findById(id);
    Simplon simplon=temp.get();
    model.addAttribute("simplon", simplon);
    return "modifier";
}

}
