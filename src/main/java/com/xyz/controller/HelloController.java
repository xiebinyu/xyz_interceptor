package com.xyz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

  @RequestMapping("/hello")
  @ResponseBody
  public String hello(@RequestAttribute String key1, @RequestAttribute String key2) {
    System.out.println("key1=" + key1 + ", key2=" + key2);
    return "hello";
  }

  @RequestMapping("/")
  @ResponseBody
  public String init() {
    return "";
  }
}
