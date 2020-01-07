package kr.byweb.ta.user.anlysStd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.byweb.ta.user.anlysStd.service.AnlysStdService;

@RestController
public class AnlysStdController {
	
	@Autowired
	private AnlysStdService anlysStdService;
	
	@GetMapping(path = "/helloWorld")
	public String helloWorld() {
		
		String strTime = "";
		try {
			strTime = anlysStdService.selectTime();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return strTime;
	}
}
