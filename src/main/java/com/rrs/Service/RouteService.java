package com.rrs.Service;

import com.rrs.Dto.RouteDto;
import com.rrs.entity.Route;

public interface RouteService {
			//Create and save a new Route.
			RouteDto saveRoute(Route route);

			// Retrieve a Route by their unique ID.
			RouteDto getRouteById(int id);

			// Update a Route by their unique ID.
			RouteDto updateRouteById(long id, Route route);

			// Delete a Route by their unique ID.
			void deleteRouteById(int id);

}
