package oit.is.lec03.security.controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sample31Controller {

  @GetMapping("/sample3/step1")
  public String sample21() {
    return "sample31.html";
  }

  @GetMapping("/sample3/step2")
  public String sample32(ModelMap model, Principal prin) {
    String loginUser = prin.getName(); // ログインユーザ情報
    model.addAttribute("login_user", loginUser);
    return "sample31.html";
  }
}
