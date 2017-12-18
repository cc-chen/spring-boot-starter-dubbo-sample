package cn.teaey.sprintboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import cn.teaey.sprintboot.service.AbcService;

/**
 * @author xiaofei.wxf(teaey)
 * @since 0.0.0
 */
@SpringBootApplication
public class Client {
    public static void main(String[] args) {
//        ConfigurableApplicationContext run = SpringApplication.run(Client.class, args);
//        AbcService bean = run.getBean(AbcService.class);
//        System.out.println(bean.echoService.echo("abccc"));
    	SpringApplication.run(Client.class, args);
    }
}
