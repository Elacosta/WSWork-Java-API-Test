package lima.leandro.WSWorkJavaBackend.services.vehicleModelServices;

import lima.leandro.WSWorkJavaBackend.model.VehicleModelEntity;
import lima.leandro.WSWorkJavaBackend.repository.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class VehicleModelFindAllService {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    /**
     * @return retorna todos os objetos cadastrados do banco
     */
    public List<VehicleModelEntity> findAll() {
        return (List<VehicleModelEntity>) this.vehicleModelRepository.findAll();
    }
}
