package com.config.server.spring_cloud_config_server;

import java.util.Map;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */

@SpringBootApplication
@EnableConfigServer
public class App {
	public static void main(String[] args) {
		
		System.clearProperty("server.port");

		Map<String, String> map = System.getenv();
		map.entrySet().stream().forEach(a -> System.out.println(a.getKey() + "::" + a.getValue()));

		System.out.println("***********");

		Properties props = System.getProperties();
		props.entrySet().stream().forEach(a -> System.out.println(a.getKey() + " :: " + a.getValue()));

		System.out.println("Hello World!");

		SpringApplication.run(App.class, args);
	}
}
