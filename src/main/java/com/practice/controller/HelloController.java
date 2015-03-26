package com.practice.controller;

import com.practice.domain.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Bajrang on 26-03-2015.
 */
@RestController

public class HelloController {
  @RequestMapping(value = "/hello",method = RequestMethod.GET)
 public ResponseEntity<String> sayHello(@RequestParam(value = "name",required = false) String name){
     String greetMessage = Greeting.sayHello(name);
     return new ResponseEntity<String>(greetMessage, HttpStatus.OK);
 }

}
