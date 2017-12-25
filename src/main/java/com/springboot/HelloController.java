/**
 *
 */
package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kouguangyuan
 * Created by 2017年11月28日 下午5:20:59
 */
@RestController
public class HelloController {

	@Value("${name}")
	private String name;
	
	@Value("${age}")
	private Integer age;
	
	@Value("${content}")
	private String content;
	
	@Autowired
	private People people;
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String say() {
		//return "hello spring boot";
		return "hellohehe:" + name + age + content + "people:" + people.getAge();
	}
}
