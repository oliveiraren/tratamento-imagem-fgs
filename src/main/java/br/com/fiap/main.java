package br.com.fiap;

import org.opencv.core.Core;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class main {

	public static void main(String[] args) {
		SpringApplication.run(main.class, args);
		System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	}

}
