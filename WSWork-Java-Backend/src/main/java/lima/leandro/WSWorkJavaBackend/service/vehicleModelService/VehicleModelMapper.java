package lima.leandro.WSWorkJavaBackend.service.vehicleModelService;

import lima.leandro.WSWorkJavaBackend.dto.VehicleModelDTO;
import lima.leandro.WSWorkJavaBackend.entity.BrandEntity;
import lima.leandro.WSWorkJavaBackend.entity.VehicleModelEntity;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
public class VehicleModelMapper {

    /**
     * @param vehicleModelEntity recebe um objeto entidade para se tornar DTO
     * @return retorna um objeto DTO
     */
    public static VehicleModelDTO vehicleModelToDTO(VehicleModelEntity vehicleModelEntity) {
        VehicleModelDTO vehicleModelDTO = new VehicleModelDTO();
        vehicleModelDTO.setVehicleModelId(vehicleModelEntity.getVehicleModelId());
        vehicleModelDTO.setVehicleModelName(vehicleModelEntity.getVehicleModelName());
        vehicleModelDTO.setFipeValue(vehicleModelEntity.getFipeValue());
        vehicleModelDTO.setBrandId(vehicleModelEntity.getBrandEntity().getBrandId());
        return vehicleModelDTO;
    }

    /**
     * @param vehicleModelDTO recebe um objeto entidade para se tornar DTO
     * @return retorna um objeto DTO
     */
    public static VehicleModelEntity DTOToVehicleEntity(VehicleModelDTO vehicleModelDTO) {
        VehicleModelEntity vehicleModelEntity = new VehicleModelEntity();
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(vehicleModelDTO.getBrandId());
        vehicleModelEntity.setVehicleModelId(vehicleModelDTO.getVehicleModelId());
        vehicleModelEntity.setVehicleModelName(vehicleModelDTO.getVehicleModelName());
        vehicleModelEntity.setFipeValue(vehicleModelDTO.getFipeValue());
        vehicleModelEntity.setBrandEntity(brandEntity);
        return vehicleModelEntity;
    }
}
