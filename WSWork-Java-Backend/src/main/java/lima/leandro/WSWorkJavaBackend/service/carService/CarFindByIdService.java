package lima.leandro.WSWorkJavaBackend.service.carService;

import lima.leandro.WSWorkJavaBackend.dto.CarDTO;
import lima.leandro.WSWorkJavaBackend.entity.CarEntity;
import lima.leandro.WSWorkJavaBackend.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class CarFindByIdService {

    @Autowired
    private CarRepository carRepository;

    public CarDTO findById(long id) {
        Optional<CarEntity> carEntity = this.carRepository.findById(id);
        return carEntity
                .map(CarMapper::carToDTO)
                .orElse(null);
    }
}
