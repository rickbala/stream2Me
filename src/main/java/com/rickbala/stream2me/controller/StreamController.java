package com.rickbala.stream2me.controller;

import com.rickbala.stream2me.utils.Utils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StreamController {

	private static String text = "Chat: ";

	@GetMapping("/decypher")
	@ResponseBody
	public String decypher(){;
		text = text + Utils.getRandomLetter();
		if (text.length() % 80 == 0) text = text + "<br/>";
		System.out.println(text);
		return text;
	}

	@GetMapping("/getStream")
	@ResponseBody
	public String getStream(){
		return text;
	}

	@GetMapping("/postStream")
	@ResponseBody
	public void postStream(@RequestParam String var){
		text = text + var;
	}

	@GetMapping("/generateRandomColor")
	@ResponseBody
	public String generateRandomColor(){
		return Utils.generateRandomRGBColor();
	}

}
