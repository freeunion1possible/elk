package com.example.elk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.zipkin.stream.EnableZipkinStreamServer;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer		//Zipkin Server编写
@EnableZipkinStreamServer
public class ZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplication.class, args);
	}
}
