package com.myapp.transportlogistics.service;

import com.myapp.transportlogistics.repository.Truck;
import java.util.ArrayList;
import org.springframework.stereotype.Service;


@Service
public class TruckService {
    private final ArrayList<Truck> trucks = new ArrayList<>();

    public TruckService() {
        trucks.add(new Truck(1, "AB 1234-7", 15000, 35));
        trucks.add(new Truck(2, "AB 9872-5", 4000, 15));
        trucks.add(new Truck(3, "AB 1111-0", 9000, 26));
    }

    public ArrayList<Truck> getTrucks(int liftingCapacity, int cargoVolume) {
        ArrayList<Truck> filteredTrucks = new ArrayList<>();

        for (Truck truck : trucks) {
            if (truck.getCargoVolume() == cargoVolume
                    && truck.getLiftingCapacity() == liftingCapacity) {
                filteredTrucks.add(truck);
            }
        }
        if (filteredTrucks.isEmpty()) {
            throw new IllegalArgumentException("No such trucks found");
        } else {
            return filteredTrucks;
        }
    }

    public Truck getTruck(int id) {
        for (Truck truck : trucks) {
            if (truck.getId() == id) {
                return truck;
            }
        }
        throw new IllegalArgumentException("Truck with ID " + id + " not found.");
    }
}
