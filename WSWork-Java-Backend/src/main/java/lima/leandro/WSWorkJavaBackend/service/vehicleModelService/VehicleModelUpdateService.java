package lima.leandro.WSWorkJavaBackend.service.vehicleModelService;

import lima.leandro.WSWorkJavaBackend.dto.VehicleModelDTO;
import lima.leandro.WSWorkJavaBackend.entity.VehicleModelEntity;
import lima.leandro.WSWorkJavaBackend.repository.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class VehicleModelUpdateService {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    /**
     * @param vehicleModelDTO recebe um objeto DTO
     * @return retorna um objeto atualizado para o banco
     */
    public VehicleModelDTO update(VehicleModelDTO vehicleModelDTO) {
        VehicleModelEntity vehicleModelEntity = this.vehicleModelRepository.save(
                VehicleModelMapper.DTOToVehicleEntity(vehicleModelDTO)
        );
        return VehicleModelMapper.vehicleModelToDTO(vehicleModelEntity);
    }
}
