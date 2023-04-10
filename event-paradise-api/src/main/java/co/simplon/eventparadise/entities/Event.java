package co.simplon.eventparadise.entities;

import java.time.LocalDate;

public class Event {

    private Long id;

    private String name;

    private LocalDate date;

    private Place place;

    private Topic topic;

    private Long rate;

    private String description;

    public Event() {

    }

    public Long getId() {
	return id;
    }

    public void setId(Long id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public LocalDate getDate() {
	return date;
    }

    public void setDate(LocalDate date) {
	this.date = date;
    }

    public Place getPlace() {
	return place;
    }

    public void setPlace(Place place) {
	this.place = place;
    }

    public Topic getTopic() {
	return topic;
    }

    public void setTopic(Topic topic) {
	this.topic = topic;
    }

    public Long getRate() {
	return rate;
    }

    public void setRate(Long rate) {
	this.rate = rate;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    @Override
    public String toString() {
	return "{id=" + id + ", name=" + name + ", date="
		+ date + ", place=" + place + ", topic="
		+ topic + ", rate=" + rate
		+ ", description=" + description + "}";
    }

}
