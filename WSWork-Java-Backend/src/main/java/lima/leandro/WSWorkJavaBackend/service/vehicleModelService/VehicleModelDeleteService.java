package lima.leandro.WSWorkJavaBackend.service.vehicleModelService;

import lima.leandro.WSWorkJavaBackend.repository.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Leandro Lima
 * @since 20/05/2022
 * @version 1.0.0 Bumblebee
 */
@Service
public class VehicleModelDeleteService {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    /**
     * @param id recebe o id para ser deletado
     * @return se o id existir, será deletado e retornará true, senão, retornará false como erro
     */
    public boolean deleteById(long id) {
        if (this.vehicleModelRepository.existsById(id)) {
            this.vehicleModelRepository.deleteById(id);
            return true;
        }
        return false;
    }

}
