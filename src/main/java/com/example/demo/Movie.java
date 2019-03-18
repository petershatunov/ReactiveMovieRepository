package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Movie implements Serializable {

    private String name;
    private int score;

    public Movie(String name, int score) {
	this.name = name;
	this.score = score;
    }
}
