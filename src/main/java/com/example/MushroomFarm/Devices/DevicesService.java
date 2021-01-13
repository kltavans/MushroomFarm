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

    public Device get(long device_id) {
        return devicesRepository.findById((int) device_id).get();
    }


    public void delete(long device_id) {
    	devicesRepository.deleteById((int) device_id);
    }
    
    public String findID(long device_id ) {
    	return devicesRepository.findID(device_id);
    }
    
    public String alldevicenaam(String device_naam) {
    	return devicesRepository.alldevicenaam(device_naam);
    }
    
}

