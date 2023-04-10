package co.simplon.eventparadise.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.eventparadise.database.DataBase;
import co.simplon.eventparadise.dtos.LabelValue;
import co.simplon.eventparadise.entities.Topic;

@RestController
@RequestMapping("/topics")
@CrossOrigin
public class TopicController {

    @GetMapping
    public Collection<LabelValue> getAll() {
	Collection<Topic> topics = DataBase.findAllTopic();
	Collection<LabelValue> topicsList = new ArrayList<>();
	for (Topic topic : topics) {
	    LabelValue element = new LabelValue();
	    element.setId(topic.getId());
	    element.setName(topic.getName());
	    topicsList.add(element);
	}
	return topicsList;
    }
}
