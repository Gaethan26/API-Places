package com.backend.test.service;

import java.util.List;
import com.testbackend.test.dao.PlaceDAO;
import com.testbackend.test.model.Place;
@Path("/places")
public class PlaceService {
	
	@GET
    public List<Place> getPlaces_JSON() {
        List<Place> listOfPlaces = PlaceDAO.getAllPlaces();
        return listOfPlaces;
    }
	 
	@GET
	@Path("/{getPlace}")
    public Place getPlace(String placeName) {
        return PlaceDAO.getPlace(placeName);
    }
	@POST
	@Path("/{publishPlace}")
    public Place addPlace(Place place) {
        return PlaceDAO.addPlace(place);
    }
	
	@PUT
	@Path("/{editPlace}")
    public Place updatePlace(Place place) {
        return PlaceDAO.updatePlace(place);
    }
	
	@DELETE
	@Path("/{placeName}")
    public void deletePlace(String placeName) {
        PlaceDAO.deletePlace(placeName);
    }
 
}