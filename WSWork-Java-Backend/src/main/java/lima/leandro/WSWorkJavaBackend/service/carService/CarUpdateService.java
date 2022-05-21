package lima.leandro.WSWorkJavaBackend.service.carService;

import lima.leandro.WSWorkJavaBackend.dto.CarDTO;
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
public class CarUpdateService {

    @Autowired
    private CarRepository carRepository;

    public CarDTO update(CarDTO carDTO) {
        CarEntity carEntity = this.carRepository.save(
                CarMapper.DTOToCar(carDTO)
        );
        return CarMapper.carToDTO(carEntity);
    }
}
