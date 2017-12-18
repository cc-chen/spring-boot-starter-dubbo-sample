package cn.teaey.sprintboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.teaey.sprintboot.service.AbcService;
import cn.teaey.sprintboot.test.EchoService;

@RestController
public class AbcController {

	@Reference(version = "1.0.0")
	private EchoService echoService;
	
	@Autowired
	private AbcService abcService;

	@RequestMapping("/echo/{str}")
	public String echo(@PathVariable String str) {
		return echoService.echo(str);
	}

}
