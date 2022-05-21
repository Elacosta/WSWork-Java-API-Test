package lima.leandro.WSWorkJavaBackend.service.carService;

import lima.leandro.WSWorkJavaBackend.dto.CarDTO;
import lima.leandro.WSWorkJavaBackend.dto.CarEndPointDTO;
import lima.leandro.WSWorkJavaBackend.dto.VehicleModelDTO;
import lima.leandro.WSWorkJavaBackend.entity.CarEntity;
import lima.leandro.WSWorkJavaBackend.repository.CarRepository;
import lima.leandro.WSWorkJavaBackend.service.vehicleModelService.VehicleModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CarEndPointFindByIdService {

    @Autowired
    private CarRepository carRepository;

    public CarEndPointDTO findById(long id) {
        Optional<CarEntity> carEntity = this.carRepository.findById(id);
        return carEntity
                .map(CarEndPointMapper::carEndPointToDTO)
                .orElse(null);
    }
}
