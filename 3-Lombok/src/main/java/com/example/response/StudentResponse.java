package com.example.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class StudentResponse {

	@JsonIgnore
	private long id;

	@JsonProperty("first_name")
	private String firstName;

	private String lastName;

}
