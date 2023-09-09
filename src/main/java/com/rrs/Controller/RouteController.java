package com.rrs.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.rrs.Dto.RouteDto;
import com.rrs.Service.RouteService;
import com.rrs.Util.RouteConverter;

public class RouteController {
	@Autowired
	RouteService routeService;

	@Autowired
	RouteConverter routeConverter;
   
    @PostMapping("/createRoute")
    public ResponseEntity<RouteDto> createRoute(@RequestBody RouteDto routeDto) {
    	RouteDto createdRoute = routeService.saveRoute(routeConverter.convertRouteDtoToEntity(routeDto));
        return new ResponseEntity<>(createdRoute, HttpStatus.CREATED);
    }

    @GetMapping("getRouteById/{id}")
    public ResponseEntity<RouteDto> getRouteById(@PathVariable int id) {
    	RouteDto route = routeService.getRouteById(id);
        return new ResponseEntity<>(route, HttpStatus.OK);
    }

    @PutMapping("updateRouteById/{id}")
    public ResponseEntity<RouteDto> updateRouteById(@PathVariable int id, @RequestBody RouteDto routeDto) {
    	RouteDto updatedRoute = routeService.updateRouteById(id, routeConverter.convertRouteDtoToEntity(routeDto));
        return new ResponseEntity<>(updatedRoute, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRouteById(@PathVariable int id) {
    	routeService.deleteRouteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
