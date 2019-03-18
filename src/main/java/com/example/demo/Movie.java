package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {

    private String name;
    private int score;

    public Movie(String name, int score) {
	this.name = name;
	this.score = score;
    }
}
