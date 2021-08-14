package com.testbackend.test.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.testbackend.test.model.Place;

public class PlaceDAO {
	private static final Map<String, Place> placeMap = new HashMap<String, Place>();
	 
    static {
        initPlaces();
    }
    
    private static void initPlaces() {
    	Place place1 = new Place("Place Saint-Marc", "Venise", "Italie", LocalDate.now(), LocalDate.now());;
    	Place place2 = new Place("Musée du Louvre", "Paris", "France", LocalDate.now(), LocalDate.now());;
    	Place place3 = new Place("Tour de Pise", "Pise", "Italie", LocalDate.now(), LocalDate.now());;
 
        placeMap.put(place1.getName(), place1);
        placeMap.put(place2.getName(), place2);
        placeMap.put(place3.getName(), place3);
    }
    
    //create
    public static Place addPlace(Place place) {
        placeMap.put(place.getName(), place);
        return place;
    }
    
    //edit
    public static Place updatePlace(Place place) {
        placeMap.put(place.getName(), place);
        return place;
    }
    
    //getSpecific
    public static Place getPlace(String placeName) {
        return placeMap.get(placeName);
    }
    
    //getAll
    public static List<Place> getAllPlaces() {
        Collection<Place> c = placeMap.values();
        List<Place> list = new ArrayList<Place>();
        list.addAll(c);
        return list;
    }
    
    //remove
    public static void deletePlace(String placeName) {
    	placeMap.remove(placeName);
    }
    
    List<Place> list;
}