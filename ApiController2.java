package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;

@RestController
public class ApiController2 {
  @GetMapping("/add")
  public List<Address> display()

	{

		return Arrays.asList(new Address("Sara",100,"Park Avenue",10002000,"South Hampton","Leek","York","England"));

	}
}
