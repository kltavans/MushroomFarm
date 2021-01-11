package com.example.MushroomFarm.Devices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class DevicesService {
	
	@Autowired
    DevicesRepository devicesRepository;

    public List<Device> listAll() {
        return devicesRepository.findAll();
    }

    public void save(Device device) {
    	devicesRepository.save(device);
    }
	
    public void change(Device device) {
    	devicesRepository.save(device);
    }

    public Device get(long deviceID) {
        return devicesRepository.findById((int) deviceID).get();
    }


    public void delete(long deviceID) {
    	devicesRepository.deleteById((int) deviceID);
    }
    
    public String findID(long deviceID ) {
    	return devicesRepository.findID(deviceID);
    }
    
}

