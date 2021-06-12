package br.com.juliana.questionforum.controller;

import br.com.juliana.questionforum.controller.dto.TopicDto;
import br.com.juliana.questionforum.model.Topic;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {
	
	@RequestMapping("/topics")
	public List<TopicDto> list() {
		Topic topic = new Topic("Doubt", "Doubt with Spring", new Course("Spring", "Java"));
		
		return TopicDto.converter(Arrays.asList(topic, topic, topic));
	}

}