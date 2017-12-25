package cn.tuyuan.commonweal.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("testAjaxController")
public class TestAjaxControlle {


	
	@RequestMapping(value="/testAjax")
	public String get(String content){
		System.out.println(content);
		return "testAjax";
	}
}
