package ac.id.its.dispenduk_kelahiran_kematian.dispenduk_web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_domain.Agama;
import ac.id.its.dispenduk_perkawinan_perceraian.dispenduk_services.AgamaService;

@Controller
public class AgamaController {
	
	@Autowired
	private AgamaService agamaService;
	
	@RequestMapping(value = "/agama", method = RequestMethod.GET)
	public String listAgama(Model model) {
		model.addAttribute("agama", new Agama());
		model.addAttribute("listAgama", this.agamaService.list());
		return "agama";
	}
}
