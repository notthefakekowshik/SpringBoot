package com.spring.boot.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//@RestController   //only can send a response 
@Controller
public class HomeController {

  @RequestMapping(value = {"", "/", "/home"})
  public String displayActualHomePage(Model model) {
    model.addAttribute("username", "john doe");
    return "home.html";
  }

  @RequestMapping("/con")
  public String displayContactPage() {
    return "contactsss.html";
  }

  @RequestMapping("/kwsk")
  public String ksk() {
    //return "<p>kwsk is a pro coder</p>";
	  return "kwsk.html";
  }

  @RequestMapping("/hari")
  public String Lovebirds() {
    return "hari.html";
  }
}
