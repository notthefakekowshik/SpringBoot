package com.springBootTutor.ControllerPackk;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class HelloController 
{
	@RequestMapping("/home")
	public String home()
	{
		return "home.html";
	}
	@RequestMapping("/index")
	public String indexx()
	{
		return "path.html";
	}
	@RequestMapping("/indexxx")
	public String indexxxx()
	{
		return "path.html";
	}
	
	@RequestMapping("/testing")
	public String testing()
	{
		return "testing.html";
	}
}

//@RestController
//public class HelloController
//{
//	@GetMapping("/home")
//	public String home()
//	{
//		return "home.html";
//	}
//	@GetMapping("/index")
//	public String indexx()
//	{
//		return "path.html";
//	}
//	@RequestMapping("/indexxx")
//	public String indexxxx()
//	{
//		return "path.html";
//	}
//}
