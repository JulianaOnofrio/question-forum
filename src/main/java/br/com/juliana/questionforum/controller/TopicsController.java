package br.com.juliana.questionforum.controller;

import br.com.juliana.questionforum.controller.dto.TopicDto;
import br.com.juliana.questionforum.model.Topic;
import br.com.juliana.questionforum.model.Course;
import br.com.juliana.questionforum.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicsController {

	@Autowired
	private TopicRepository topicRepository;

	@RequestMapping("/topics")
	public List<TopicDto> list() {
		List<Topic> topics = topicRepository.findAll();
		return TopicDto.converter(topics);
	}

}