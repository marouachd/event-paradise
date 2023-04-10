package co.simplon.eventparadise.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.eventparadise.database.DataBase;
import co.simplon.eventparadise.dtos.LabelValue;
import co.simplon.eventparadise.entities.Place;

@RestController
@RequestMapping("/places")
@CrossOrigin
public class PlaceController {

    @GetMapping
    public Collection<LabelValue> getAll() {
	Collection<Place> places = DataBase.findAll();
	Collection<LabelValue> placesList = new ArrayList<>();
	for (Place place : places) {
	    LabelValue element = new LabelValue();
	    element.setId(place.getId());
	    element.setName(place.getName());
	    placesList.add(element);
	}
	return placesList;
    }

}
