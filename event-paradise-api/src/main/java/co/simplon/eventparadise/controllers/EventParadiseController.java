package co.simplon.eventparadise.controllers;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.eventparadise.database.DataBase;
import co.simplon.eventparadise.dtos.EventCreateDto;
import co.simplon.eventparadise.entities.Event;
import co.simplon.eventparadise.entities.Place;
import co.simplon.eventparadise.entities.Topic;

@RestController
@RequestMapping("/events")
public class EventParadiseController {

    @PostMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void create(
	    @Valid @RequestBody EventCreateDto inputs) {
	System.out.println(inputs);
	Event event = new Event();
	Place place = DataBase
		.findPlaceById(inputs.getPlaceId());
	Topic topic = DataBase
		.findTopicById(inputs.getTopicId());
	event.setName(inputs.getName());
	event.setDate(inputs.getDate());
	event.setPlace(place);
	event.setTopic(topic);
	event.setRate(inputs.getRate());
	event.setDescription(inputs.getDescription());
	DataBase.saveEvents(event);
	System.out.println(event);
    }

}
