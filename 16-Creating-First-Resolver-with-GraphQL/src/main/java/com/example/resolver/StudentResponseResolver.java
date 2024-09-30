package com.example.resolver;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.example.response.StudentResponse;
import com.example.response.SubjectResponse;

@Service
public class StudentResponseResolver implements GraphQLResolver<StudentResponse> {

	List<SubjectResponse> getLearningSubjects (StudentResponse studentResponse) {
		
	}
}
