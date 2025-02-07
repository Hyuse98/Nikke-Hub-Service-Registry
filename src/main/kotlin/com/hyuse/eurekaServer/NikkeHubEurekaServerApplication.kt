package com.hyuse.eurekaServer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class NikkeHubEurekaServerApplication

fun main(args: Array<String>) {
	runApplication<NikkeHubEurekaServerApplication>(*args)
}
