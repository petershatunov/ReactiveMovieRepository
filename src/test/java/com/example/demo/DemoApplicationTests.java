package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	public void contextLoads() {
	    webTestClient
			    .get()
			    .uri("/api/flux") // GET method and URI
			    .accept(MediaType.TEXT_EVENT_STREAM) //setting ACCEPT-Content
			    .exchange() //gives access to response
			    .expectStatus().isOk() //checking if response is OK
			    .expectBody(String.class).isEqualTo(""
			    + "data:{\"name\":\"Polar (2019)\",\"score\":64}\n" + "\n"
			    + "data:{\"name\":\"Iron Man (2008)\",\"score\":79}\n" + "\n"
			    + "data:{\"name\":\"The Shawshank Redemption (1994)\",\"score\":93}\n" + "\n"
			    + "data:{\"name\":\"Forrest Gump (1994)\",\"score\":83}\n" + "\n"
			    + "data:{\"name\":\"Glass (2019)\",\"score\":70}\n" + "\n");
	}

}
