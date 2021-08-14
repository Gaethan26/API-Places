package com.testbackend.test.model;

import java.time.LocalDate;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		Place place1 = new Place("Saint-Marc", "Venezia", "Italy", LocalDate.now(), LocalDate.now());
		System.out.println(place1.getName());
		System.out.println(place1.getCity());
		System.out.println(place1.getState());
		System.out.println(place1.getCreatedAt());
		System.out.println(place1.getUpdatedAt());
	}
}