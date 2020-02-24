package com.rickbala.stream2me.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.rickbala.stream2me.utils.Utils;

@Controller
public class StreamController {

	private static String text = "";

	@GetMapping("/getStream")
	@ResponseBody
	public String getStream(){;
		text = text + Utils.getRandomLetter();
		if (text.length() % 80 == 0) text = text + "<br/>";
		System.out.println(text);
		return text;
	}

}
