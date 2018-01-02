package com.example.courseapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
	private TopicService topicservice;

	@RequestMapping("/topics")
	public List<Topic> getAllTopic()
	{
		return Arrays.asList(
				new Topic("Spring", "java Framework", "spring Description", "CS Computer"),
				new Topic("Spring", "java Framework", "spring Description2", "CS Computer"),
				new Topic("Spring", "java Framework", "spring Description3", "CS Computer"),
				new Topic("Spring", "java Framework", "spring Description4", "CS Computer")
				);
	}
}
