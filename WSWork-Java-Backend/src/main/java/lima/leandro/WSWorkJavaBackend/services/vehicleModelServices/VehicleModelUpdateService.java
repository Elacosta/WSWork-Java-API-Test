package lima.leandro.WSWorkJavaBackend.services.vehicleModelServices;

import lima.leandro.WSWorkJavaBackend.model.VehicleModelEntity;
import lima.leandro.WSWorkJavaBackend.repository.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleModelUpdateService {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    public VehicleModelEntity update(VehicleModelEntity vehicleModelEntity) {
        if (vehicleModelRepository.existsById(vehicleModelEntity.getVehicleModelId())) {
            return this.vehicleModelRepository.save(vehicleModelEntity);
        }
        return null;
    }
}
