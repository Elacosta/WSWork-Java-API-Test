package lima.leandro.WSWorkJavaBackend.service.carService;

import lima.leandro.WSWorkJavaBackend.dto.CarDTO;
import lima.leandro.WSWorkJavaBackend.entity.BrandEntity;
import lima.leandro.WSWorkJavaBackend.entity.CarEntity;
import lima.leandro.WSWorkJavaBackend.entity.VehicleModelEntity;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
public class CarMapper {

    public static CarDTO carToDTO (CarEntity carEntity) {
        CarDTO carDTO = new CarDTO();
        carDTO.setCarId(carEntity.getCarId());
        carDTO.setTimestampRegister(carEntity.getTimestampRegister());
        carDTO.setCarYear(carEntity.getCarYear());
        carDTO.setTypeOfFuel(carEntity.getTypeOfFuel());
        carDTO.setDoorNumber(carEntity.getDoorNumber());
        carDTO.setCarColor(carEntity.getCarColor());
        carDTO.setVehicleModelId(carEntity.getVehicleModelEntity().getVehicleModelId());
        carDTO.setBrandId(carEntity.getBrandEntity().getBrandId());
        return carDTO;
    }

    public static CarEntity DTOToCar (CarDTO carDTO) {
        CarEntity carEntity = new CarEntity();
        VehicleModelEntity vehicleModelEntity = new VehicleModelEntity();
        BrandEntity brandEntity = new BrandEntity();
        vehicleModelEntity.setVehicleModelId(carDTO.getVehicleModelId());
        brandEntity.setBrandId(carDTO.getBrandId());
        carEntity.setCarId(carDTO.getCarId());
        carEntity.setTimestampRegister(carDTO.getTimestampRegister());
        carEntity.setCarYear(carDTO.getCarYear());
        carEntity.setTypeOfFuel(carDTO.getTypeOfFuel());
        carEntity.setDoorNumber(carDTO.getDoorNumber());
        carEntity.setCarColor(carDTO.getCarColor());
        carEntity.setVehicleModelEntity(vehicleModelEntity);
        carEntity.setBrandEntity(brandEntity);
        return carEntity;
    }
}
