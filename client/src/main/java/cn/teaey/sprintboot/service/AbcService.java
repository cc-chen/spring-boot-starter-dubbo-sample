package cn.teaey.sprintboot.service;

import com.alibaba.dubbo.config.annotation.Reference;

import cn.teaey.sprintboot.test.EchoService;

import org.springframework.stereotype.Component;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
@Component
public class AbcService {
	
    @Reference(version = "1.0.0")
    public EchoService echoService;
    
    public void echo(String str){
    	echoService.echo(str);
    }
    
}
