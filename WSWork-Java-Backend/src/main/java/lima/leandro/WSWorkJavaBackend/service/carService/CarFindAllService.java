package lima.leandro.WSWorkJavaBackend.service.carService;

import lima.leandro.WSWorkJavaBackend.dto.CarDTO;
import lima.leandro.WSWorkJavaBackend.repository.CarRepository;
import lima.leandro.WSWorkJavaBackend.service.vehicleModelService.VehicleModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class CarFindAllService {

    @Autowired
    private CarRepository carRepository;

    public List<CarDTO> findAll() {
        return this.carRepository.findAll()
                .stream()
                .map(CarMapper::carToDTO)
                .collect(Collectors.toList());
    }
}
