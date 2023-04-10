package co.simplon.eventparadise.database;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import co.simplon.eventparadise.entities.Event;
import co.simplon.eventparadise.entities.Place;
import co.simplon.eventparadise.entities.Topic;

public class DataBase {

    private static Long placeId = 0L;
    private static Long eventId = 0L;
    private static Long topicId = 0L;
    private static final Map<Long, Place> PLACES = new HashMap<>();
    private static final Map<Long, Event> EVENTS = new HashMap<>();
    private static final Map<Long, Topic> TOPICS = new HashMap<>();

    static {
	Place paris = new Place();
	placeId++;
	paris.setId(placeId);
	paris.setName("Paris");
	PLACES.put(placeId, paris);

	Place rennes = new Place();
	placeId++;
	rennes.setId(placeId);
	rennes.setName("Rennes");
	PLACES.put(placeId, rennes);

	Place marseille = new Place();
	placeId++;
	marseille.setId(placeId);
	marseille.setName("Marseille");
	PLACES.put(placeId, marseille);
    }

    public static Collection<Place> findAll() {
	return PLACES.values();
    }

    static {
	Topic ecologie = new Topic();
	topicId++;
	ecologie.setId(topicId);
	ecologie.setName("Ecologie");
	TOPICS.put(topicId, ecologie);

	Topic rh = new Topic();
	topicId++;
	rh.setId(topicId);
	rh.setName("Ressources Humaines");
	TOPICS.put(topicId, rh);

	Topic tech = new Topic();
	topicId++;
	tech.setId(topicId);
	tech.setName("Tech");
	TOPICS.put(topicId, tech);
    }

    public static Collection<Topic> findAllTopic() {
	return TOPICS.values();
    }

    public static Place findPlaceById(Long id) {

	return PLACES.get(id);
    }

    public static Topic findTopicById(Long id) {

	return TOPICS.get(id);
    }

    public static void saveEvents(Event event) {
	eventId++;
	event.setId(eventId);
	EVENTS.put(eventId, event);

    }
}
