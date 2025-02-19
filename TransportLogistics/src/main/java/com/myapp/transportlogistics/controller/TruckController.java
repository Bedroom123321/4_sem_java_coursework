package com.myapp.transportlogistics.controller;

import com.myapp.transportlogistics.repository.Truck;
import com.myapp.transportlogistics.service.TruckService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//http://localhost:8080/trucks?cargoVolume=15000&liftingCapacity=35
//http://localhost:8080/trucks/1

@RestController
@RequestMapping(path = "trucks")
public class TruckController {

    private final TruckService truckService;

    public TruckController(TruckService truckService) {
        this.truckService = truckService;
    }

    @GetMapping
    public List<Truck> getTrucks(@RequestParam int cargoVolume,
                                 @RequestParam int liftingCapacity) {
        return truckService.getTrucks(liftingCapacity, cargoVolume);
    }

    @GetMapping(path = "{id}")
    public Truck getTruck(@PathVariable int id) {
        return truckService.getTruck(id);
    }

}
