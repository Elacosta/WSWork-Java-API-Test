package lima.leandro.WSWorkJavaBackend.DTO;


import lima.leandro.WSWorkJavaBackend.controller.VehicleModelController;
import lima.leandro.WSWorkJavaBackend.model.VehicleModelEntity;

public class VehicleModelBrandDTO {

    public long vehicleModelId;
    public String vehicleModelName;
    public int fipeValue;
    public long brandId;

    public VehicleModelBrandDTO(VehicleModelEntity vehicleModelEntity) {
        this.vehicleModelId = vehicleModelEntity.getVehicleModelId();
        this.vehicleModelName = vehicleModelEntity.getVehicleModelName();
        this.fipeValue = vehicleModelEntity.getFipeValue();
        this.brandId = vehicleModelEntity.getBrandEntity().getBrandId();
    }

}
