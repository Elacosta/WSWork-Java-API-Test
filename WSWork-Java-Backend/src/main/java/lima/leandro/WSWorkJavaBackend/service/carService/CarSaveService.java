package lima.leandro.WSWorkJavaBackend.service.carService;

import lima.leandro.WSWorkJavaBackend.entity.CarEntity;
import lima.leandro.WSWorkJavaBackend.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class CarSaveService {

    @Autowired
    private CarRepository carRepository;


    public CarEntity save(CarEntity carEntity) {
        if (carEntity.getCarColor().length()>3) {
            return this.carRepository.save(carEntity);
        }
        return null;
    }

}
