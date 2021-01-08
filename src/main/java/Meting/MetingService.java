package Meting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class MetingService {
	@Autowired
    MetingRepository metingRepository;

    public List<Meting> listAll() {
        return metingRepository.findAll();
    }

    public void save(Meting meting) {
    	metingRepository.save(meting);
    }
	
    public void change(Meting meting) {
    	metingRepository.save(meting);
    }

    public Meting get(long metingID) {
        return metingRepository.findById((int) metingID).get();
    }


    public void delete(long metingID) {
    	metingRepository.deleteById((int) metingID);
    }
    
    public String findID(long metingID ) {
    	return metingRepository.findID(metingID);
    }
}
