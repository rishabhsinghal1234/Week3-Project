package com.week3project.controller;

import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

@Service
public class TopicService {
	
	
	private List<Topic> topics =  new ArrayList<>(Arrays.asList(
			new Topic("1", "a", "b"),
			new Topic("2", "ab", "bc"),
			new Topic("3", "rishabh", "bd")
			));
	
	public List<Topic> getAll(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	public void addtopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updatetopic(String id, Topic topic) {
		for(int i = 0; i< topics.size();i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
	}

	public void deletetopic(String id) {
		topics.removeIf(t -> t.getId().equals(id));
	}
}




