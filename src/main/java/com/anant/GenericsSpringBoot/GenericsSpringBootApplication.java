package com.anant.GenericsSpringBoot;
import com.anant.GenericsSpringBoot.*;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GenericsSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenericsSpringBootApplication.class, args);
		
		//GenericClassDemo<Integer> gen=new GenericClassDemo<>(42);
		
		//GenericClassDemo<Integer,String> gen=new GenericClassDemo<>(42,"Anant");
		
//		GenericClassDemo<Integer, String> gen = new GenericClassDemo<>();
//		gen.setContent(33);
//		gen.setSym("Anant");
		
//		GenericClassDemo<Integer, String> gen=GenericClassDemo.createDemo(100, "rahul");
        //System.out.print(gen+" "+gen.getContent()+" "+gen.getSym());
		
		GenericClassDemo<Integer,String> gen=new GenericClassDemo<>(42,"Anant");
		Integer c[]= {2,7,9,6};
		Integer d[]=gen.createArray(c,"Abhay");
		System.out.println(Arrays.toString(d));
	}

}
