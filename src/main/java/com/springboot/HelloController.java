/**
 *
 */
package com.springboot;

import java.lang.reflect.Method;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kouguangyuan
 * Created by 2017年11月28日 下午5:20:59
 */
@RestController
public class HelloController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String say() {
		return "hello spring boot";
	}
}
