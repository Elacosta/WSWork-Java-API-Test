package lima.leandro.WSWorkJavaBackend.service.carService;

import lima.leandro.WSWorkJavaBackend.dto.CarDTO;
import lima.leandro.WSWorkJavaBackend.dto.CarEndPointDTO;
import lima.leandro.WSWorkJavaBackend.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarEndPointFindAllService {

    @Autowired
    private CarRepository carRepository;

    public List<CarEndPointDTO> findAll() {
        return this.carRepository.findAll()
                .stream()
                .map(CarEndPointMapper::carEndPointToDTO)
                .collect(Collectors.toList());
    }
}
