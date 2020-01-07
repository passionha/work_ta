package kr.byweb.ta.user.anlysStd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.byweb.ta.user.anlysStd.service.AnlysStdService;

@Controller
public class AnlysStdController {
	
	@Autowired
	private AnlysStdService anlysStdService;
	
//	@GetMapping(path = "/selectTime")
	@RequestMapping("/selectTime")
	public @ResponseBody String selectTime() {
		
		String strTime = "";
		try {
			strTime = anlysStdService.selectTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strTime;
	}
	
	@RequestMapping("/helloWorld")
	public String helloWorld(Model model) {
		
		model.addAttribute("name", "홍길동");
		
		return "anlysStdList";
	}
	
	@RequestMapping("/")
	public String anlysStdMain() {
		
		return "anlysStd/anlysStdMain";
	}
}
