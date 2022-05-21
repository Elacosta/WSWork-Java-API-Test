package lima.leandro.WSWorkJavaBackend.service.vehicleModelService;

import lima.leandro.WSWorkJavaBackend.dto.VehicleModelDTO;
import lima.leandro.WSWorkJavaBackend.repository.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public List<VehicleModelDTO> findAll() {
        return this.vehicleModelRepository.findAll()
                .stream()
                .map(VehicleModelMapper::vehicleModelToDTO)
                .collect(Collectors.toList());

    }
}