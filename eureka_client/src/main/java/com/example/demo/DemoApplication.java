package com.example.demo;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@SpringBootApplication
@EnableEurekaClient
public class DemoApplication {
//	@Autowired
//	private EurekaClient client;


//	@RequestMapping("/test")
//	public String testClient() {
//		InstanceInfo instanceInfo = client.getNextServerFromEureka("client-serverA", false);
//		return instanceInfo.getHomePageUrl();
//	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
