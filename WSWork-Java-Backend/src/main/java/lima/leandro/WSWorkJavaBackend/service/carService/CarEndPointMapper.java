package lima.leandro.WSWorkJavaBackend.service.carService;


import lima.leandro.WSWorkJavaBackend.dto.CarEndPointDTO;
import lima.leandro.WSWorkJavaBackend.entity.BrandEntity;
import lima.leandro.WSWorkJavaBackend.entity.CarEntity;
import lima.leandro.WSWorkJavaBackend.entity.VehicleModelEntity;

/**
 * @author Leandro Lima
 * @since 21/05/2022
 * @version 1.0.0 Bumblebee
 */
public class CarEndPointMapper {

    /**
     * @param carEntity recebe um objeto entidade
     * @return retorna um objeto DTO
     */
    public static CarEndPointDTO carEndPointToDTO(CarEntity carEntity) {
        CarEndPointDTO carEndPointDTO = new CarEndPointDTO();
        BrandEntity brandEntity = new BrandEntity();
        VehicleModelEntity vehicleModelEntity = new VehicleModelEntity();
        carEndPointDTO.setCarId(carEntity.getCarId());
        carEndPointDTO.setBrandId(carEntity.getBrandEntity().getBrandId());
        carEndPointDTO.setBrandName(carEntity.getBrandEntity().getBrandName());
        carEndPointDTO.setVehicleModelName(carEntity.getVehicleModelEntity().getVehicleModelName());
        carEndPointDTO.setCarYear(carEntity.getCarYear());
        carEndPointDTO.setTypeOfFuel(carEntity.getTypeOfFuel());
        carEndPointDTO.setDoorNumber(carEntity.getDoorNumber());
        carEndPointDTO.setFipeValue(carEntity.getVehicleModelEntity().getFipeValue());
        carEndPointDTO.setCarColor(carEntity.getCarColor());
        carEndPointDTO.setTimestampRegister(carEntity.getTimestampRegister());
        return carEndPointDTO;
    }

    /**
     * @param carEndPointDTO recebe um objeto DTO
     * @return retorna um objeto entidade
     */
    public static CarEntity DTOToCarEndPoint(CarEndPointDTO carEndPointDTO) {
        CarEntity carEntity = new CarEntity();
        VehicleModelEntity vehicleModelEntity = new VehicleModelEntity();
        BrandEntity brandEntity = new BrandEntity();
        vehicleModelEntity.setVehicleModelName(carEndPointDTO.getVehicleModelName());
        vehicleModelEntity.setFipeValue(carEndPointDTO.getFipeValue());
        brandEntity.setBrandId(carEndPointDTO.getBrandId());
        brandEntity.setBrandName(carEndPointDTO.getBrandName());
        carEntity.setCarId(carEndPointDTO.getCarId());
        carEntity.setBrandEntity(brandEntity);
        carEntity.setVehicleModelEntity(vehicleModelEntity);
        carEntity.setCarYear(carEndPointDTO.getCarYear());
        carEntity.setTypeOfFuel(carEndPointDTO.getTypeOfFuel());
        carEntity.setDoorNumber(carEndPointDTO.getDoorNumber());
        carEntity.setCarColor(carEndPointDTO.getCarColor());
        carEntity.setTimestampRegister(carEndPointDTO.getTimestampRegister());
        return carEntity;
    }
}
