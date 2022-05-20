package lima.leandro.WSWorkJavaBackend.services.vehicleModelServices;

import lima.leandro.WSWorkJavaBackend.model.VehicleModelEntity;
import lima.leandro.WSWorkJavaBackend.repository.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class VehicleModelFindByIdService {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    /**
     * @param id recebe o id para pegar o dado do banco
     * @return retorna o objeto com o id solicitado
     */
    public Optional<VehicleModelEntity> findById(long id) {
        return this.vehicleModelRepository.findById(id);
    }
}
