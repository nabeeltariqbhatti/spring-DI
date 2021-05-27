package com.example.demo.controller;


import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestEndPoints {
	@Value("${course.name}")
	private String cName;
	
	@Value("${course.chapterCount}")
	private int cchapterCount;
	
	@Autowired
	private CourseConfigurations courseConfigurations;
	@RequestMapping("/defaultcourse")
	public Course getDefaultCourses(@RequestParam(value="name", defaultValue="spring boot", required = false) String name,
			@RequestParam(value="chapterCount", defaultValue="2", required = false) int chapterCount) {
		return new Course(cName,cchapterCount);
	}
	
	
	@RequestMapping("/configcourse")
	public HashMap<String,String> configCourses() {
		HashMap<String,String> _hashMap = new HashMap<String,String>();
		
		int ch =courseConfigurations.getChapterCount();
		_hashMap.put("name", courseConfigurations.getName());
		_hashMap.put("chapterCount",Integer.toString(ch));
		_hashMap.put("author",courseConfigurations.getAuthor());
		_hashMap.put("rating",Integer.toString(courseConfigurations.getRating()));
		
		return _hashMap;

	}
	
	@RequestMapping("/course")
	public Course getEndPoint(@RequestParam(value="name", defaultValue="spring boot", required = false) String name,
			@RequestParam(value="chapterCount", defaultValue="2", required = false) int chapterCount) {
		return new Course(name,chapterCount);
	}
	

	@RequestMapping(method=RequestMethod.POST,value="/course/register")
	public Course saveCourse(@RequestBody Course course) {
		
		return course;
	
	}

}
