package com.week3project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondController {
	
	@Autowired
	private TopicService topivservice;
	
	@RequestMapping("/topics")
	public List<Topic> allTopics() {
		return topivservice.getAll();
	}
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable("id") String id) {
		return topivservice.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void add(@RequestBody Topic topic) {
		topivservice.addtopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void update(@RequestBody Topic topic, @PathVariable String id) {
		topivservice.updatetopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deletet(@PathVariable String id) {
		topivservice.deletetopic(id);
	}

}








