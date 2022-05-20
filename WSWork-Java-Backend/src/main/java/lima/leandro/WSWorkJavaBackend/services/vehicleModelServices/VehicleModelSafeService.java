package lima.leandro.WSWorkJavaBackend.services.vehicleModelServices;

import lima.leandro.WSWorkJavaBackend.model.VehicleModelEntity;
import lima.leandro.WSWorkJavaBackend.repository.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class VehicleModelSafeService{

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    /**
     * @param vehicleModelEntity recebe um objeto para ser salvo no banco
     * @return retorna o objeto salvo no banco caso funcione, senão, retornará nulo
     */
    public VehicleModelEntity save(VehicleModelEntity vehicleModelEntity) {
        if (vehicleModelEntity.getVehicleModelName().length()>3) {
            return this.vehicleModelRepository.save(vehicleModelEntity);
        }
        return null;
    }


}
