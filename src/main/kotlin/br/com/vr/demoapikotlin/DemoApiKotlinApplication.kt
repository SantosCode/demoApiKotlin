package br.com.vr.demoapikotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoApiKotlinApplication

fun main(args: Array<String>) {
	runApplication<DemoApiKotlinApplication>(*args)
}
