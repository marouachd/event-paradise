package co.simplon.eventparadise.dtos;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class EventCreateDto {

    @Size(min = 1, max = 255)
    @NotNull
    private String name;

    @NotNull
    private LocalDate date;

    @NotNull
    private Long placeId;

    @NotNull
    private Long topicId;

    @Positive
    @NotNull
    private Long rate;

    @Size(min = 1, max = 1000)
    @NotNull
    private String description;

    public EventCreateDto() {

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

    public Long getPlaceId() {
	return placeId;
    }

    public void setPlaceId(Long placeId) {
	this.placeId = placeId;
    }

    public Long getTopicId() {
	return topicId;
    }

    public void setTopicId(Long topicId) {
	this.topicId = topicId;
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
	return "{name=" + name + ", date=" + date
		+ ", placeId=" + placeId + ", topicId="
		+ topicId + ", rate=" + rate
		+ ", description=" + description + "}";
    }

}
