package com.peishujuan;



import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * 启动服务提供者
 * @author a'su's
 *
 */
public class BootStart {

	public static void main(String[] args) throws IOException {
		
		System.out.println();
		
		//加载配置文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		//加载到服务器
		context.start();
		
		//如果用户不输入就  阻塞  在此
		System.in.read();
	}
}
