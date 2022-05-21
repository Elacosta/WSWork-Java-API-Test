package lima.leandro.WSWorkJavaBackend.service.carService;

import lima.leandro.WSWorkJavaBackend.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarDeleteService {

    @Autowired
    private CarRepository carRepository;

    public boolean deleteById(long id) {
        if (this.carRepository.existsById(id)) {
            this.carRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
