package com.icarus.tutorial.spring.helloworld.impl;

import com.icarus.tutorial.spring.helloworld.HelloWorld;

public class StrutsHelloWorld implements HelloWorld {

	@Override
	public void sayHello() {
		System.out.println("Struts Say Hello!!");
	}
}
