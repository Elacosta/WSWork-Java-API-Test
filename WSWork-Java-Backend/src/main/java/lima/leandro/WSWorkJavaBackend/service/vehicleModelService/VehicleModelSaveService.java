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
public class VehicleModelSaveService {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    /**
     * @param vehicleModelDTO recebe um objeto DTO
     * @return retorna um objeto para ser salvo no banco
     */
    public VehicleModelDTO save(VehicleModelDTO vehicleModelDTO) {
        if (vehicleModelRepository.existsById(vehicleModelDTO.getBrandId())) {
            VehicleModelEntity vehicleModelEntity = this.vehicleModelRepository.save(
                    VehicleModelMapper.DTOToVehicleEntity(vehicleModelDTO)
            );
            return VehicleModelMapper.vehicleModelToDTO(vehicleModelEntity);
        }
        return null;
    }
}
