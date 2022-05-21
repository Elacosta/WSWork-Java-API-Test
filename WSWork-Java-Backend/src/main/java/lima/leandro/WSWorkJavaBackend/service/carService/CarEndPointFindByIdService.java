package lima.leandro.WSWorkJavaBackend.service.carService;

import lima.leandro.WSWorkJavaBackend.dto.CarEndPointDTO;
import lima.leandro.WSWorkJavaBackend.entity.CarEntity;
import lima.leandro.WSWorkJavaBackend.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Leandro Lima
 * @since 21/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class CarEndPointFindByIdService {

    @Autowired
    private CarRepository carRepository;

    /**
     * @param id recebe o id do objeto para ser pêgo do banco de dados
     * @return retorna o objeto selecionado do banco de dados
     */
    public CarEndPointDTO findById(long id) {
        Optional<CarEntity> carEntity = this.carRepository.findById(id);
        return carEntity
                .map(CarEndPointMapper::carEndPointToDTO)
                .orElse(null);
    }
}
